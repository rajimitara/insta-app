package com.instagram.application.exception;

public class InstagramApiExceptions extends Exception{
	 ErrorCode errorCode;
	 public InstagramApiExceptions(String message) {
		super(message);
	}
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	
	public enum ErrorCode{
		int err;
		
		"INTERNAL_SERVER_ERROR",
		"BAD_REQUEST"
		
		ErrorCode(int err){
			this.err = err;
		}
		
	}
}

