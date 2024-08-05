package com.techlabs.test;

import com.techlabs.model.Runnablethread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		Runnablethread thread1 = new Runnablethread("Thread 1");
		Runnablethread thread2 = new Runnablethread("Thread 2");
		Runnablethread thread3 = new Runnablethread("Thread 3");
		
		((Runnablethread) thread1).getThread().setPriority(Thread.MAX_PRIORITY);
		((Runnablethread) thread2).getThread().setPriority(Thread.MIN_PRIORITY);
		((Runnablethread) thread3).getThread().setPriority(Thread.NORM_PRIORITY);

		
		System.out.println(((Runnablethread) thread1).getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		System.out.println(thread3.getThread().isAlive());

		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		System.out.println(thread1.getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		System.out.println(thread3.getThread().isAlive());
	}
}