package com.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.mode.pojo.examiner;

@MapperScan
public interface ExaminerDao {
	examiner findbyid(int id);
	examiner findbyusername(String username);
}
