package com.ddww.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddww.web.Member;
import com.ddww.web.repository.MemberRepository;
import com.ddww.web.service.MemberService;


@Controller
public class MemberController {
@Autowired
private MemberRepository memberRepository;

@Autowired
private MemberService memberService;
	@GetMapping("/members")
	public String members(Model model) {
		
		  List<Member> list = memberRepository.findTop5ByOrderByMnoDesc();
		//적어볼까요?
		/*
		 * findAll() 전체 가져오기
		 * findOne() p키를 기준으로 하나 가져오기
		 * save() 저장하기/수정하기
		 * count()  숫자 세기
		 * delete() 삭제하기
		 * 
		 * 
		 */
		
		model.addAttribute("list", list);
		return "members";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	@PostMapping("login")
	public String login(Member member, HttpSession session) {
		System.out.println(member);
		
		int count = memberService.count(member);
		System.out.println("카운트 : "+ count);
		
		if(count ==1) {
		Member result = memberService.findByMidAndMpw(member);
		System.out.println("이름은 " + result.getMname());
		session.setAttribute("id", result.getMid());
		session.setAttribute("name", result.getMname());
		return "redirect:/index";
		}else {
			return "login";
		}
	}
}
