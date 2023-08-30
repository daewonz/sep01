package com.ddww.web.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ddww.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);

}
