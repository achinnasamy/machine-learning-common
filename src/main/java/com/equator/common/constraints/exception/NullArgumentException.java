package com.equator.common.constraints.exception;

public class NullArgumentException extends RuntimeException {

	private static final long serialVersionUID = 7442653561794343789L;

	private String message;
	 
	public NullArgumentException() {
	}
	
	public NullArgumentException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
