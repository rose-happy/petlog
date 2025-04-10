package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HomeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class HomeController {
	private final HomeService homeService;
	@GetMapping("/home")
	public void home(HttpServletResponse httpServletResponse){
		System.out.println(homeService.homeService(1));
	}
}
