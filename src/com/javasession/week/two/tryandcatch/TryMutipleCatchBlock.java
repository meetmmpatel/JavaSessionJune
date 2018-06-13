package com.javasession.week.two.tryandcatch;

public class TryMutipleCatchBlock {
	public static void main(String[] args) {
		int num[] = { 23, 45, 56, 67, 88, 99 };
		try {
			
			num[4] = 20 / 1;

		} catch (ArithmeticException e) {
			System.out.println("An ArithmeticException occure");

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("index out of bound error");
		} 

		System.out.println("End of the process");
		System.out.println(num[4]);

	}

}
