package com.example.cars.exceptions;

/**
 * The type Resource not found exception.
 * 
 * @author Eduardo
 */
public class ResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new Resource not found exception.
	 * 
	 * @param message the message
	 */
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
