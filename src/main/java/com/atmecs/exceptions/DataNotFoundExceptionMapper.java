package com.atmecs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class DataNotFoundExceptionMapper extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorDetails> DataNotFound(DataNotFoundException ex, WebRequest request){
		ErrorDetails errorMessage = new ErrorDetails(ex.getMessage(), "404", "Employee Not Found");
		return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
	}
}
