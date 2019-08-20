package com.instagram.application.repository;

import java.util.LinkedHashMap;
import java.util.Map;


import com.instagram.application.model.Profile;


public class ProfileRepository {
	Map<Long,Profile> profiles;

	public Map<Long,Profile> getUsers() {
		return profiles;
	}

	public void setUsers(Map<Long,Profile> profiles) {
		this.profiles = profiles;
	}
	
	public void addToUsers(Profile profile) {
		if(profiles.isEmpty())
			this.profiles = new LinkedHashMap<Long,Profile>();
		this.profiles.put(profile.getProfileId(), profile);
	}
	
	//Should act as DB and also perform CRUD.
	
	public Profile getProfile(Long profileId){
		return profiles.get(profileId);
	}
	
}
