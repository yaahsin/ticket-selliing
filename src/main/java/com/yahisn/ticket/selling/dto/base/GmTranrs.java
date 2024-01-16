package com.yahisn.ticket.selling.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GmTranrs {
	
	@JsonProperty("TicketInfo")
	private String ticketInfo;

	public String getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(String ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	@Override
	public String toString() {
		return "GmTranrs [ticketInfo=" + ticketInfo + "]";
	}
	
}
