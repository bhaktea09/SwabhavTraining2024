package com.techlabs.behavourial.model;

public class Emailnotifier implements INotifier {
	Account account;
	@Override
	public void notification(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getBalance());
		System.out.println("email notification");
	}


	

	

}
