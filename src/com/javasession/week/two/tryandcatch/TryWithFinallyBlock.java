package com.javasession.week.two.tryandcatch;

import java.util.Scanner;

public class TryWithFinallyBlock {
	public static void tryFinally() {

		Scanner scan = new Scanner(System.in);
		try {
			int num = scan.nextInt();
			

		} finally {
			scan.close();
		}

	}

	public static void main(String[] args) {
		try {
			int number = 234 / 1;
			System.out.println(number);

		} catch (ArithmeticException e) {
			System.out.println("Number can not devide by zero");
		} finally {
			System.out.println("End of block");
		}

		tryFinally();

	}

}
