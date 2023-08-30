package com.ddww.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddww.web.dao.BoardDAO;
import com.ddww.web.dto.BoardDTO;

@Service
public class BoardService {
@Autowired
BoardDAO boardDAO;

public List<BoardDTO> list() {
	// TODO Auto-generated method stub
	return boardDAO.list();
}

public BoardDTO detail(int bno) {
	// TODO Auto-generated method stub
	return boardDAO.detail(bno);
}
}
