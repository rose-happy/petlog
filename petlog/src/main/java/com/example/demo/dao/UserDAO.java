package com.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserRequestDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDAO {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate.setDataSource(datasource);
	}
	public String userInsert(UserRequestDTO user) {
		String query = "insert into user1 (user_id, password, name) values (?, ? ,?)";
		this.jdbcTemplate.update(query, 1, user.getPassword(), user.getName());
		String result = "SUCCESS";
		return result;
		
	}
}
