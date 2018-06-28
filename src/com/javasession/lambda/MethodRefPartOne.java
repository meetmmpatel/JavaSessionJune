package com.javasession.lambda;

public class MethodRefPartOne {

	public static void main(String[] args) {

		Thread task = new Thread(MethodRefPartOne::printMessage);
		task.start();

	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
