package com.instagram.application.api.handler;

import com.instagram.application.exception.InstagramApiExceptions;
import com.instagram.application.model.User;
import com.instagram.application.service.ApplicationServices;

public class Authentication extends BusinessDelegate{

	private ApplicationServices applicationServices;
	@Override
	public UserResponse execute(Request request) throws InstagramApiExceptions {
		// do validations , set state and call user signup
		try{ 
			User user = new User();
			applicationServices.createUser(user);
		}catch(Exception ex){
			//State , check how its done
			throw new InstagramApiExceptions("500");
		}
		
		
		return null;
	}

}
