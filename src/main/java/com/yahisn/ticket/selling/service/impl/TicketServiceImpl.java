package com.yahisn.ticket.selling.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.yahisn.ticket.selling.dto.GmRequest;
import com.yahisn.ticket.selling.dto.GmResponse;
import com.yahisn.ticket.selling.dto.base.GmHeader;
import com.yahisn.ticket.selling.dto.base.GmTranrs;
import com.yahisn.ticket.selling.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	RedisTemplate<String, String> redisTemplate;

	Integer count = 0;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public GmResponse snapTicket(GmRequest request) {
		String eventId = request.getGmTranrq().getEventId();
		Integer amount = request.getGmTranrq().getAmount();
		GmResponse gmResponse = new GmResponse();
		GmHeader gmHeader = new GmHeader();
		GmTranrs gmTranrs = new GmTranrs();

		try {
			Long updatedAmount = redisTemplate.opsForValue().increment(eventId, amount);
			if (updatedAmount == null) {
				redisTemplate.opsForValue().set(eventId, String.valueOf(amount));
			}

			count += amount;

			gmHeader.setReturnCode("0000");
			gmHeader.setReturnDesc("交易成功");
			gmTranrs.setTicketInfo("EventId: " + eventId + " /Amount: " + amount + " /Number: " + count);

		} catch (Exception ex) {
			gmHeader.setReturnCode("1111");
			gmHeader.setReturnDesc("交易失敗");
			gmTranrs.setTicketInfo("EventId: " + eventId + " /Amount: " + amount);

			logger.error("[Exception] -->" + "Request: " + request + "message: " + ex.getMessage());

		}
		gmResponse.setGmHeader(gmHeader);
		gmResponse.setGmTrans(gmTranrs);

		return gmResponse;

	}

}
