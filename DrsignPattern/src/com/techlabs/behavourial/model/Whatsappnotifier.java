package com.techlabs.behavourial.model;

public class Whatsappnotifier implements INotifier{
	@Override
	public void notification(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getBalance());
		System.out.println("whatsapp notification");
	}
}
