package com.ibank.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ibank.app.dto.UserDto;

public interface UserService extends UserDetailsService{

	public String saveUser(UserDto user);
}
