package com.instagram.application.api.handler;

public abstract class BusinessDelegate {

	public enum State{
		REQUEST_RECEIVED,
		PAYLOAD_VALIDATE,
		PAYLOAD_VALIDATION_FAILED,
		HEADER_VALIDATION_FAILED,
		
	}
	
	public abstract UserResponse execute(String body);
}
