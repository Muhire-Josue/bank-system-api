package com.ibank.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

	@PostMapping(path = "/signup")
	public String signup() {
		return "Signup successfully";
	}
	
	@PostMapping(path = "/login")
	public String login() {
		return "Login successfully";
	}
}
