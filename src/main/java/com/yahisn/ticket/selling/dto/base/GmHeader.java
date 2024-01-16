package com.yahisn.ticket.selling.dto.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GmHeader {
	
	@JsonProperty("RETURNCODE")
	private String returnCode;
	
	@JsonProperty("RETURNDESC")
	private String returnDesc;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnDesc() {
		return returnDesc;
	}

	public void setReturnDesc(String returnDesc) {
		this.returnDesc = returnDesc;
	}

	@Override
	public String toString() {
		return "GmHeader [returnCode=" + returnCode + ", returnDesc=" + returnDesc + "]";
	}
	
}
