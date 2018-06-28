package com.javasession.concurrencyAndThreads;

public class ThereadSample {
	public static void main(String[] args) {

		// We can not make the thread process ordered in which it will going to run.
		// Main Method is also known as Main Thread.

		System.out.println("From main thread");

		Thread SubclassForTheread = new SubclassForTheread();
		SubclassForTheread st = new SubclassForTheread();
		// Only allowed to run one instance of the one time only.

		SubclassForTheread.start();
		st.start();

		// To create Anonymous class
		new Thread() {

			public void run() {
				System.out.println("Thread from the anonymous class");
			}

		}.start();

		System.out.println("Hello again from main thread");

	}

}

class SubclassForTheread extends Thread {
	@Override
	public void run() {

		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread From another class");
	}

}
