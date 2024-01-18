package com.yahisn.ticket.selling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yahisn.ticket.selling.dto.GmRequest;
import com.yahisn.ticket.selling.dto.GmResponse;
import com.yahisn.ticket.selling.exception.RequestInvalidException;
import com.yahisn.ticket.selling.service.TicketService;

import jakarta.validation.Valid;

@RestController
public class TicketController {

	@Autowired
	TicketService ticketService;

	@PostMapping("/snap-ticket")
	public GmResponse buyTicket(@RequestBody @Valid GmRequest gmRequest, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) throw new RequestInvalidException(bindingResult);
		
		return ticketService.snapTicket(gmRequest);
	}
	
}
