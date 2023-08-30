package com.ddww.web.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddww.web.dao.LoginDAO;
import com.ddww.web.dto.LoginDTO;

@Service
public class LoginService {
@Autowired
private LoginDAO loginDAO;

public LoginDTO login(LoginDTO dto) {
	// TODO Auto-generated method stub
	return loginDAO.login(dto);
}
}
