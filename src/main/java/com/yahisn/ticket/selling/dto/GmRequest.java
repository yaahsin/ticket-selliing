package com.yahisn.ticket.selling.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.dto.base.GmTranrq;

import jakarta.validation.constraints.NotEmpty;

public class GmRequest {

	@JsonProperty("GM_HEADER")
	@NotEmpty
	private GmHeader gmHeader;

	@JsonProperty("GM_TRNRQ")
	@NotEmpty
	private GmTranrq gmTranrq;

	public GmHeader getGmHeader() {
		return gmHeader;
	}

	public void setGmHeader(GmHeader gmHeader) {
		this.gmHeader = gmHeader;
	}

	public GmTranrq getGmTranrq() {
		return gmTranrq;
	}

	public void setGmTranrq(GmTranrq gmTranrq) {
		this.gmTranrq = gmTranrq;
	}

	@Override
	public String toString() {
		return "GmRequest [gmHeader=" + gmHeader + ", gmTranrq=" + gmTranrq + "]";
	}
	
}
