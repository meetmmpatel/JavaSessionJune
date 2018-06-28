package com.javasession.concurrencyAndThreads;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());
		System.out.println("Creating thread...");

		Thread t1 = new ThreadExample();
		System.out.println("Starting thread...");

		t1.setName("foo");
		t1.start();
		Thread t2 = new ThreadExample();
		t2.start();
	}

}
