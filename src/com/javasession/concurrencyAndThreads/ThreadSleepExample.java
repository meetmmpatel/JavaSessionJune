package com.javasession.concurrencyAndThreads;

public class ThreadSleepExample {

	public static void main(String[] args) {

		String[] names = { "Mike", "Peter", "sami", "Steve" };

		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());

			for (String nm : names) {
				System.out.println(nm);

				try {
					Thread.sleep(4000);
				}
				catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		};
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
