package com.yahisn.ticket.selling.controller.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yahisn.ticket.selling.dto.GmResponse;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.exception.RequestInvalidException;

@RestControllerAdvice
public class WebAdvice {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(RequestInvalidException.class)
	public GmResponse onRequestInvalidException(RequestInvalidException e) {
		logger.error("[Exception] -- > RequestInvalidException: {}", e.getExMessage());
		
		GmResponse gmResponse = new GmResponse();
		GmHeader gmHeader = new GmHeader();
		gmHeader.setReturnCode("0011");
		gmHeader.setReturnDesc(e.getExMessage());
		gmResponse.setGmHeader(gmHeader);

		return gmResponse;
		
	}

}
