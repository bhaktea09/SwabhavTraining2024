package com.techlabs.model;

public class Caller implements Runnable {
	private String message;
	private Callme target;
	private Thread thread;

	public Caller(String message, Callme target) {
		super();
		this.message = message;
		this.target = target;
		thread = new Thread(this);
		thread.start();
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		synchronized (target) {
			target.call(message);
		}

	}

	public Thread getThread() {
		// TODO Auto-generated method stub
		return thread;
	}

}
