package com.atmecs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5584362944314286953L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
