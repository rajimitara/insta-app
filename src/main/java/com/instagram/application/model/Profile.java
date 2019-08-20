package com.instagram.application.model;

import java.util.List;
import java.util.Set;

public class Profile {
	
	long profileId;
	
	//profileId-s.no : photoName
	List<Photo> photos;
	//Story photos (WeakHashMap -> clean up mechanism to clear after 1D)
	
	Set<User> followers;
	
	List<UserSavedCollection> collectionPhotos;
	
	//hadoop file.

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}

	public List<UserSavedCollection> getCollectionPhotos() {
		return collectionPhotos;
	}

	public void setCollectionPhotos(List<UserSavedCollection> collectionPhotos) {
		this.collectionPhotos = collectionPhotos;
	}
	
	
}
