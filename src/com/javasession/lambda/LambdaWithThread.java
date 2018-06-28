package com.javasession.lambda;

public class LambdaWithThread {

	public static void main(String[] args) {

		// This is an example of Inner class

		Thread task1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Starting of Thread One");

			}
		}

		);

		task1.start();

		// This is an example of using lambda expression
		Thread task2 = new Thread(() -> System.out.println("Thread with use of lambda"));
		task2.start();

	}

}
