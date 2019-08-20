package com.instagram.application.api.handler;

import com.instagram.application.exception.InstagramApiExceptions;

public abstract class BusinessDelegate {

	public enum State{
		REQUEST_RECEIVED,
		AUTHENTICATED,
		PAYLOAD_VALIDATED,
		PERSISTED,
		PAYLOAD_VALIDATION_FAILED,
		HEADER_VALIDATION_FAILED,
	}
	
	public abstract UserResponse execute(Request request) throws InstagramApiExceptions;
}
