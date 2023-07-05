package com.shan.springsecurity.demo.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/showMyLoginPage")
	public String showmyLoginPage() {
//		return "plain-login";
		return "fancy-login";
	}
} 
