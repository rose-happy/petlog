package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserRequestDTO {
	String name;
	String password;
	String phone;
	String address;
	int walk_count;
	
}
