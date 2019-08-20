package com.instagram.application.service;

import com.instagram.application.exception.InstagramApiExceptions;
import com.instagram.application.model.User;

public interface ApplicationServices {

	public void createUser(User user)  throws InstagramApiExceptions;
	
	public void searchUser(String userName) throws InstagramApiExceptions;
	
}
