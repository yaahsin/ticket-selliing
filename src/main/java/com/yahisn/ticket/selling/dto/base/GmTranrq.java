package com.yahisn.ticket.selling.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class GmTranrq {
	
	@JsonProperty("EVENTID")
	@NotEmpty(message = "Event does not exist")
	private String eventId;
	
	@JsonProperty("AMOUNT")
	@NotNull
	private Integer amount;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "GmTranrq [eventId=" + eventId + ", amount=" + amount + "]";
	}
	
}
