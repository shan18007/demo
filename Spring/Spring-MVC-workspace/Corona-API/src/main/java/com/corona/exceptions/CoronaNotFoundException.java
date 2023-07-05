package com.corona.exceptions;

public class CoronaNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public CoronaNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CoronaNotFoundException(String message) {
		super(message);
	}

	public CoronaNotFoundException(Throwable cause) {
		super(cause);
	}

}
