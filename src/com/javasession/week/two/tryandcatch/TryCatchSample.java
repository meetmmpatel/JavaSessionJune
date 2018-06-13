package com.javasession.week.two.tryandcatch;

public class TryCatchSample {

	public static void main(String[] args) {
		int num1;
		int num2;

		try {
			num1 = 0;
			num2 = 34 / num1;

			System.out.println(num2);

		} catch (ArithmeticException numError) {
			System.out.println("Number can not devide by zero");
			

		}

	}

}
