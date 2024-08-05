package com.techlabs.test;

import com.techlabs.model.Q;

class Producer implements Runnable {
	private Q q;

	Producer(Q q) {
		this.q = q;
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	private Q q;

	Consumer(Q q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}

	public static void main(String args[]) {
		Q q = new Q();
		new Thread(new Producer(q), "Producer").start();
		new Thread(new Consumer(q), "Consumer").start();

		System.out.println("Press Control-C to stop.");
	}
}
