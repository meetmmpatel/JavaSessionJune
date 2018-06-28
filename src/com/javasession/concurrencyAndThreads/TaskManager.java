package com.javasession.concurrencyAndThreads;

public class TaskManager {

	public static void main(String[] args) {

		System.out.println("this is the main thread!!");
		Task tk = new Task();
		tk.setName(" A");
		tk.start();
//		tk.run();
		Task tk2 = new Task();
		tk2.setName(" B");
//		tk2.run();
	tk2.start();

		Thread task1 = new Thread(new Task1());
		task1.setName("Task");
//		task1.start();
		task1.run();

		System.out.println("this is the end of main thread!!");

	}

}

class Task extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("Number " + i + Task.currentThread().getName());
		}

	}

}

class Task1 implements Runnable {

	@Override
	public void run() {

		for (int n = 0; n < 100; n++) {
			System.out.println("Node " + n+ Task1.class.getName());
		}

	}

}
