package com.ddww.web;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jmember")
@NoArgsConstructor
@Data
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mno;
	
	@Column(length = 10)
	private String mname;
	
	@Column(name="mid", unique = true)
	private String mid;
	
	@Column(nullable = false, name="mpw")
	private String mpw;
	
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime mjoindate;
	
	
}
