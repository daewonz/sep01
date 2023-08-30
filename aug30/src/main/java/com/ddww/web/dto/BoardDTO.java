package com.ddww.web.dto;

import lombok.Data;

@Data
public class BoardDTO {
private int bno, blike, commentcount;
private String btitle, m_name, m_id, bdate, bcontent;
}
