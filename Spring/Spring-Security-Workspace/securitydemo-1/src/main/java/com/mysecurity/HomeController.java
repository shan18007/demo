package com.mysecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String showHome() {
//		return "Welcome";
		return ("<h1>Welcome to Home</h1>");
	}
	
	@GetMapping("/user")
	public String showUser() {
//		return "Welcome";
		return ("<h1>USER</h1>");
	}
	
	@GetMapping("/admin")
	public String showAdmin() {
//		return "Welcome";
		return ("<h1>Admin</h1>");
	}
}
