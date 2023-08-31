package com.ddww.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class JBoard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bno;
	
	@Column(length = 30, name = "btitle")
	private String title;
	
	@Column(columnDefinition = "MEDIUMTEXT", name = "bcontent")
	private String content;
	
	@Column(columnDefinition = "TIMESTAMP")
	private String bdate;
	
	private String mname;
}
