package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException {
	public PasswordNotValidException (String password) {
		super(" password not valid ");
	}

}
