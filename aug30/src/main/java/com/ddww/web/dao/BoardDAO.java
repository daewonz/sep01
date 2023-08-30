package com.ddww.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ddww.web.dto.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> list();

	BoardDTO detail(int bno);

}
