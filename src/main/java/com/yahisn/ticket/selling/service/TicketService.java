package com.yahisn.ticket.selling.service;

import com.yahisn.ticket.selling.dto.GmRequest;
import com.yahisn.ticket.selling.dto.GmResponse;

public interface TicketService {
	
	GmResponse snapTicket(GmRequest request) throws Exception;

}
