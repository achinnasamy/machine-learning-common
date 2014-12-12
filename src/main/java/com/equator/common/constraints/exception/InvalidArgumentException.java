package com.equator.common.constraints.exception;

/**
 * Copyright (c) 2014 iPro,Inc. and its affiliates. All rights reserved.
 */
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
