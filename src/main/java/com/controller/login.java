package com.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
	@RequestMapping("/asd")
	public String getlogin() {
		return "login";
	}
} 
