package com.ddww.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddww.web.JBoard;
import com.ddww.web.Member;
import com.ddww.web.service.BoardService;
import com.ddww.web.service.MemberService;

@Controller
public class BoardController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BoardService boardService;

	
	@GetMapping("/board")
	public String board(Model model) {
		List<JBoard> list = boardService.findAll();
		model.addAttribute("list", list);
		return "board";
	}
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write(JBoard jBoard, HttpSession session) {
		if(session.getAttribute("id") != null) {
			
		
		//System.out.println(jBoard);
		Member member = memberService.findByMid((String)session.getAttribute("id"));
		jBoard.setMember(member);
		
		boardService.save(jBoard);
		return "redirect:/board";
		}else {
			return "board";
		}
		
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam(name="bno", required = true) int bno, Model model) {
		System.out.println("bno의 값은 : " + bno);
		JBoard detail = boardService.findByBno(bno); 
		System.out.println(detail);
		model.addAttribute("detail", detail);
		return "detail";
		
	}
	
	// zz
	
	
	
	
	
	
}
