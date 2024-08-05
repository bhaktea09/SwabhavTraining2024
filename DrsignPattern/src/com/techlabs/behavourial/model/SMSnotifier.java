package com.techlabs.behavourial.model;

import javax.naming.InsufficientResourcesException;



public class SMSnotifier implements INotifier{
	
	@Override
	public void notification(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getBalance());
		System.out.println("sms notification");
	}
	public void exception(Exception e) {
		System.out.println(e.getMessage());
	}

	
	

}
