package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.techlabs.model.Task;

public class Executorservicedemo {

	public static void main(String[] args) {
		int corecount = Runtime.getRuntime().availableProcessors();
		System.out.println("available processors :" + corecount);
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
	}

}
