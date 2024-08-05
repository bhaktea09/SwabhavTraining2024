package com.techlabs.test;

import com.techlabs.model.Caller;
import com.techlabs.model.Callme;

public class Callertest {

	public static void main(String[] args) {
		
		Callme target = new Callme();
		Caller caller1=new Caller("hello", target);
		Caller caller2=new Caller("SWABHAV", target);
		Caller caller3=new Caller("TECHLABS", target);
		
		try {
			caller1.getThread().join();		
			caller2.getThread().join();	
			caller3.getThread().join();	
		
		}
		catch(InterruptedException exception)
		{
			System.out.println(exception);
		}
	}

}
