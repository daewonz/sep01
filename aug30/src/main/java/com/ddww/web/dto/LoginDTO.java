package com.ddww.web.dto;

import lombok.Data;

@Data
public class LoginDTO {
	String m_id, m_pw, m_name;
	int count;
}
