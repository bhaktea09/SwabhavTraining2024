package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.techlabs.model.Newtask;
import com.techlabs.model.Task;

public class Collableexecutordemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Integer> future = service.submit(new Newtask());
		
		List<Newtask> tasks=new ArrayList<Newtask>();
		tasks.add(new Newtask());
		tasks.add(new Newtask());
		tasks.add(new Newtask());
		
		
		try {
			//System.out.println(future.get());
			//service.invokeAny(tasks);
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future<Integer> future1 : futures)
				System.out.println(future1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
