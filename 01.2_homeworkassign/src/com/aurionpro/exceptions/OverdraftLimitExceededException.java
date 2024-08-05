package com.aurionpro.exceptions;

import com.aurionpro.model.AcctE;

public class OverdraftLimitExceededException extends RuntimeException {
	public OverdraftLimitExceededException () {
		super (" Overdraft Limit Exceeded error :");
	}
}
