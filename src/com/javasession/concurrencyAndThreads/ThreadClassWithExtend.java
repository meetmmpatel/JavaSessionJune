package com.javasession.concurrencyAndThreads;

public class ThreadClassWithExtend extends Thread {

	public static void main(String[] args) {

		System.out.println("Inside Main Thread!");

		Thread t1 = new Thread();

		System.out.println("Creating new Thread!");

		t1.start();
		System.out.println("Straritng Thread");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside : " + Thread.currentThread().getName());
			}
		};

		System.out.println("Creating Thread With Runnable...");
		Thread thread = new Thread(runnable);

		System.out.println("Starting Thread...");
		thread.start();
		
		 System.out.println("Creating Runnable using Lambda...");
	        Runnable runnable1 = () -> {
	            System.out.println("Inside : " + Thread.currentThread().getName());
	        };

	}

}
