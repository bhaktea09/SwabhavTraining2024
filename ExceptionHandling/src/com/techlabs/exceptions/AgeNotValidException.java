package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException {
	public String getMessage() 
	{
		return " age must be less than 18 :";
	}

}
