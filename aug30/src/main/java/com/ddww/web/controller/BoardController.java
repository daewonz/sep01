package com.ddww.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddww.web.dto.BoardDTO;
import com.ddww.web.service.BoardService;

@Controller
public class BoardController {
@Autowired
private BoardService boardService;


//pageNo
	@GetMapping("/board")
	public String board(@RequestParam(name = "pageNo", required = false, defaultValue = "1") int pageNo, Model model) {
		
		//pageNo === (pageNo -1) * 10
		
		List<BoardDTO> list = boardService.list((pageNo -1) * 10);
		System.out.println(list);	
		model.addAttribute("list", list);
		return "board";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam(name = "bno", required = true) int bno, Model model) {
		System.out.println(bno);
		BoardDTO detail = boardService.detail(bno);
		model.addAttribute("detail", detail);
		return "detail";
	}
	
}
