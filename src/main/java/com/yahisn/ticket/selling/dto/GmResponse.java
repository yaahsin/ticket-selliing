package com.yahisn.ticket.selling.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.dto.base.GmTranrs;

public class GmResponse {
	
	@JsonProperty("GM_HEADER")
	private GmHeader gmHeader;

	@JsonProperty("GM_TRANRS")
	private GmTranrs gmTranrs;

	public GmHeader getGmHeader() {
		return gmHeader;
	}

	public void setGmHeader(GmHeader gmHeader) {
		this.gmHeader = gmHeader;
	}

	public GmTranrs getGmTranrs() {
		return gmTranrs;
	}

	public void setGmTranrs(GmTranrs gmTranrs) {
		this.gmTranrs = gmTranrs;
	}

	@Override
	public String toString() {
		return "GmResponse [gmHeader=" + gmHeader + ", gmTranrs=" + gmTranrs + "]";
	}
	
}
