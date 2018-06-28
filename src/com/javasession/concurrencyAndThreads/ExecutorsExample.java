package com.javasession.concurrencyAndThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating Executor Service...");
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		System.out.println("Creating a Runnable...");
		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());
		};

		System.out.println("Submit the task specified by the runnable to the executor service.");
		executorService.submit(runnable);

		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Shutting down the executor");
		executorService.shutdown();
	}

}
