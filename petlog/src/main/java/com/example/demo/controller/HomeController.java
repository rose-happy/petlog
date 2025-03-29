package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/home")
	public void home(HttpServletResponse httpServletResponse){
		System.out.println("HOMES2");
	}
}
