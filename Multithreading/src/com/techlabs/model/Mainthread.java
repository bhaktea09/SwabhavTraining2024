package com.techlabs.model;

public class Mainthread {
	private void main() {
		Thread thread = Thread.currentThread();
		System.out.println(thread);

		thread.setName("Mythread");
		System.out.println(thread);

		for (int i = 5; i > 0; i--) {
			System.out.println(thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1034);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
