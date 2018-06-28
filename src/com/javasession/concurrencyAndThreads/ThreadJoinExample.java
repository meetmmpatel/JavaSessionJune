package com.javasession.concurrencyAndThreads;

public class ThreadJoinExample {

	public static void main(String[] args) {

		Runnable run1 = new Runnable() {

			@Override
			public void run() {
				String[] str = { "AA", "BB", "CC", "DD" };
				for (String s : str) {
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						System.out.println("Thread sleep Error");
					}
					System.out.println(s);
				}
					System.out.println("End Of thread One");
			}

		};
		Thread t1 = new Thread(run1);
		t1.start();

		Runnable run2 = new Runnable() {

			@Override
			public void run() {
				String[] str = { "EE", "FF", "GG", "HH" };
				for (String s : str) {
					try {
						Thread.sleep(2000);
					}
					catch (InterruptedException e) {
						System.out.println("Error while t2 sleep");
					}
					System.out.println(s);
				}

			}
		};
		Thread t2 = new Thread(run2);

		try {

			t1.join(5000);

			t2.start();
			
		}
		catch (InterruptedException e) {
			System.out.println("Error while joining t1 to t2");
		}

	}

}
