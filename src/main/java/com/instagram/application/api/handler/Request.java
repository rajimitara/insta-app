package com.instagram.application.api.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;


public class Request {
	
	public HttpMethod httpMethod;
	
	public HttpHeaders httpHeaders;
	
	public enum InstaClient{
		FACEBOOK
	}
	
	
	
}
