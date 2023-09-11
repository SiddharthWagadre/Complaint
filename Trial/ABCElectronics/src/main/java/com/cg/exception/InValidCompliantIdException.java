package com.cg.exception;

public class InValidCompliantIdException extends RuntimeException{
	
	private static final long serialVersion = 1L;
	
	public InValidCompliantIdException(String message ) {
		super(message);
	}
	public InValidCompliantIdException(String message,Throwable throwable) {
		super(message,throwable);
	}


}
