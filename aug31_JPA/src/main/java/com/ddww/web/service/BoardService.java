package com.ddww.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddww.web.JBoard;
import com.ddww.web.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;

	public List<JBoard> findAll() {
		return boardRepository.findAll();
	}

	public void save(JBoard jBoard) {
		boardRepository.save(jBoard);
	}

	public JBoard findByBno(int bno) {
		// TODO Auto-generated method stub
		return boardRepository.findByBno(bno);
	}
}
