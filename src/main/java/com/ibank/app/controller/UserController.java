package com.ibank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibank.app.dto.UserDto;
import com.ibank.app.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(path = "/signup")
	public String signup(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
		return "Signup successfully";
	}
	
	@PostMapping(path = "/login")
	public String login() {
		return "Login successfully";
	}
}
