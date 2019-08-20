package com.instagram.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.instagram.application.exception.InstagramApiExceptions;
import com.instagram.application.model.User;
import com.instagram.application.repository.ProfileRepository;
import com.instagram.application.repository.UserRepository;
import com.instagram.application.service.ApplicationServices;

public class ApplicationServicesImpl implements ApplicationServices {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public void createUser(User user) throws InstagramApiExceptions {
		userRepository.addToUsers(user);
	}

	@Override
	public void searchUser(String userName) throws InstagramApiExceptions {
		// TODO Auto-generated method stub
		
	}
	
}
