package com.yahisn.ticket.selling.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.dto.base.GmTranrq;

import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GmRequest {

	@JsonProperty("GM_HEADER")
	@NotNull
	private GmHeader gmHeader;

	@JsonProperty("GM_TRNRQ")
	@NotNull
	private GmTranrq gmTranrq;

	public GmHeader getGmHeader() {
		return gmHeader;
	}

	public void setGmHeader(GmHeader gmHeader) {
		this.gmHeader = gmHeader;
	}

	public GmTranrq getTranrq() {
		return gmTranrq;
	}

	public void setTranrq(GmTranrq gmTranrq) {
		this.gmTranrq = gmTranrq;
	}

	@Override
	public String toString() {
		return "GmRequest [gmHeader=" + gmHeader + ", GmTranrq=" + gmTranrq + "]";
	}

}
