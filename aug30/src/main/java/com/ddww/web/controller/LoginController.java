package com.ddww.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.ddww.web.dto.LoginDTO;
import com.ddww.web.service.LoginService;

@Controller
public class LoginController {
@Autowired
private LoginService loginService;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("login")
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println(dto.getM_id());
		System.out.println(dto.getM_pw());
		dto = loginService.login(dto);
		System.out.println(dto);
		if(dto.getM_name() != null || dto.getCount() == 1) {
			session.setAttribute("mid", dto.getM_id());
			session.setAttribute("mname", dto.getM_name());
			
			return "redirect:/board";
		}else {
		return "redirect:/login";
		}
	}
}
