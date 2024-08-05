package com.techlabs.test;

import com.techlabs.model.Mythread;

public class Threadtest {

	public static void main(String[] args) {
		Mythread thread1 = new Mythread("Thread11");
		Mythread thread2 = new Mythread("Thread12");
		Mythread thread3 = new Mythread("Thread13");
		Mythread thread4 = new Mythread("Thread14");

		{
			for (int i = 5; i > 0; i--) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
