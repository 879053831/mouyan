package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class indexController {
	@RequestMapping("/log")
	public String login() {
		return "login";
	}
	@RequestMapping("/service")
	public String servicelist() {
		return "service";
	}

}
