package com.techlabs.model;

public class Runnablethread implements Runnable {
	private Thread thread;

	public Runnablethread(String name) {
		thread = new Thread(this);
		thread.start();
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
