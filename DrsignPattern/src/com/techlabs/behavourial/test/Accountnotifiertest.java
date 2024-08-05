package com.techlabs.behavourial.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.Notification;
import com.techlabs.behavourial.model.Account;
import com.techlabs.behavourial.model.Emailnotifier;
import com.techlabs.behavourial.model.INotifier;
import com.techlabs.behavourial.model.SMSnotifier;
import com.techlabs.behavourial.model.Whatsappnotifier;

public class Accountnotifiertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<INotifier> notifier = new ArrayList<>();

		Account account = new Account(123, "bhakti", 4000, notifier);
		INotifier sms = new SMSnotifier();
		INotifier email = new Emailnotifier();
		INotifier whatsapp = new Whatsappnotifier();

//		System.out.println(account.getNotifier());
		email.notification(account);
		sms.notification(account);
		whatsapp.notification(account);

	}

}
