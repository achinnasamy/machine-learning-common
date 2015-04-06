package com.equator.common.constraints.exception;

public class InvalidArgumentException extends RuntimeException {

	private static final long serialVersionUID = 7442653561794343789L;

	private String message;
	 
	public InvalidArgumentException() {
	}
	
	public InvalidArgumentException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
