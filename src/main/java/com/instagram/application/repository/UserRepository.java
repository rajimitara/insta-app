package com.instagram.application.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import com.instagram.application.model.User;

public class UserRepository {
	
	Map<String,User> users;

	public Map<String,User> getUsers() {
		return users;
	}

	public void setUsers(Map<String,User> users) {
		this.users = users;
	}
	
	public void addToUsers(User user) {
		if(users.isEmpty())
			this.users = new LinkedHashMap<String,User>();
		this.users.put(user.getUserName(), user);
	}
	
	//Should act as DB and also perform CRUD.
	
	public User getUser(String userId){
		return users.get(userId);
	}

	
	
	
}
