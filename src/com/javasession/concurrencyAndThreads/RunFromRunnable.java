package com.javasession.concurrencyAndThreads;

public class RunFromRunnable {

	public static void main(String[] args) {
		Thread tr = new Thread(new ThreadFromRunnable());
		tr.setName("==== Thread One=====");

		tr.start();

	}

}

class ThreadFromRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("From Runnable Interface");

	}

}
