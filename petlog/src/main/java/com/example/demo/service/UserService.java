package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserRequestDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService{
	private final UserDAO userDAO;

	public String userInsert(UserRequestDTO user) {
		return userDAO.userInsert(user);
	}
	
}
