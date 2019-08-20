package com.instagram.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.application.api.handler.BusinessDelegate;
import com.instagram.application.api.handler.Request;
import com.instagram.application.exception.InstagramApiExceptions;
import com.instagram.application.model.User;
import com.instagram.application.repository.ProfileRepository;
import com.instagram.application.repository.UserRepository;
import com.instagram.application.service.ApplicationServices;

@RestController
public class InstagramApiV1Controller {

	private ApplicationServices applicationService;
	
	private BusinessDelegate businessDelegate;
	//collection
	
	@PostMapping(value="/v1/users")
	public void addUser(@RequestBody String body){
		try{
			 Request request = new Request();
			 businessDelegate.execute(request);	
		}catch(InstagramApiExceptions ex){
			
		}
	}
	
	//document
	
	@GetMapping(value="/v1/users/{user-id}")
	public void getUser(@PathVariable("user-id") String userId){
		
		
	}

	//controller
	
	@GetMapping(value="/v1/search/{search-query}")
		public void searchInstagram(@PathVariable("search-query") String searchQuery){
			
	}
		
	//store
	@GetMapping(value="/v1/{user-id}/stories")
	public void getStory(@PathVariable("user-id") String userId){
		
	}
}
