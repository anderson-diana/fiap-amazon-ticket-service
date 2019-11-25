package com.fiap.amazon.fiapamazonticketservice.exception;

import com.fiap.amazon.fiapamazonticketservice.exception.RecordNotFoundException;


public class TicketNotFoundException extends RecordNotFoundException {

	private static final long serialVersionUID = 1L;

	public TicketNotFoundException(String message) {
		super(message);
	}

	public TicketNotFoundException() {
		super("Ticket not found");
	}

}
