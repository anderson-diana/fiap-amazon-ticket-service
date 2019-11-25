package com.fiap.amazon.fiapamazonticketservice.exception;


public class RecordNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String message) {
		super(message);
	}

	public RecordNotFoundException() {
		this("Record not found");
	}

}
