package com.yahisn.ticket.selling.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.dto.base.GmTranrs;

public class GmResponse {
	
	@JsonProperty("GM_HEADER")
	private GmHeader gmHeader;

	@JsonProperty("GM_TRNRS")
	private GmTranrs gmTranrs;

	public GmHeader getGmHeader() {
		return gmHeader;
	}

	public void setGmHeader(GmHeader gmHeader) {
		this.gmHeader = gmHeader;
	}

	public GmTranrs getGmTrans() {
		return gmTranrs;
	}

	public void setGmTrans(GmTranrs gmTrans) {
		this.gmTranrs = gmTrans;
	}

	@Override
	public String toString() {
		return "GmResponse [gmHeader=" + gmHeader + ", gmTrans=" + gmTranrs + "]";
	}
	
}
