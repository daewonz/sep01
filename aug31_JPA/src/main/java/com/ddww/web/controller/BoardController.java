package com.ddww.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddww.web.JBoard;
import com.ddww.web.repository.BoardRepository;

@Controller
public class BoardController {
@Autowired
private BoardRepository boardRepository;
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	@PostMapping("/write")
	public String write(JBoard jBoard) {
		jBoard.setMname("포로로");
		System.out.println(jBoard.getContent());
		System.out.println(jBoard.getTitle());
		boardRepository.save(jBoard);
		
	
		
		return "redirect:/board";
	}
	
	@GetMapping("/board")
	public String board() {
		return "board";
	}
}
