package com.yahisn.ticket.selling.exception;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class RequestInvalidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	StringBuilder exMessage = new StringBuilder("ArgumentsInvalid: ");
	
	public RequestInvalidException() {};
	
	public RequestInvalidException(BindingResult bindingResult){
		List<FieldError> fieldErrors = bindingResult.getFieldErrors();
		
		fieldErrors.stream().forEach(err -> exMessage.append(", " + err.getDefaultMessage()));
		
	}

	public String getExMessage() {
		return exMessage.toString();
	}

	

}
