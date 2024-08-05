package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.Login;

public class Logintest {

	public static void main(String[] args) {
		
		Login login=Login.getLogin();
		System.out.println(login.hashCode());
		
		Login login2 = Login.getLogin();
		System.out.println(login2.hashCode());
		
	}

}
