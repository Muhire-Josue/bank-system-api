package com.ibank.app.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ibank.app.dto.UserDto;
import com.ibank.app.entity.User;
import com.ibank.app.repository.UserRepository;
import com.ibank.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public String saveUser(UserDto user) {
		User userEntity = new User();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(userEntity);
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
