package com.techlabs.model;

public class Mythread extends Thread {
	public Mythread(String name) {
		super();
		start();
	}
	public void run() {
		for(int i=5;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ":" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
