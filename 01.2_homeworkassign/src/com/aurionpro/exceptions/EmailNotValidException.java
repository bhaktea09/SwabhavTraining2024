package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException {
	public EmailNotValidException (String email) {
		super(" email not valid ");
	}
}
