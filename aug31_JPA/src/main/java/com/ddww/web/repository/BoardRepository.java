package com.ddww.web.repository;

import org.springframework.data.repository.Repository;

import com.ddww.web.JBoard;

public interface BoardRepository extends Repository<JBoard, Long> {

	void save(JBoard jBoard);




}
