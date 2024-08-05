package com.aurionpro.exceptions;

import com.aurionpro.model.AcctE;

public class MinimumBalanceException extends RuntimeException {
	public MinimumBalanceException () {
		super (" minimum balance error :");
	}
}
