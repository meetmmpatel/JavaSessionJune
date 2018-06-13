package com.javasession.week.two.tryandcatch;

public class NestedTryCatchBlock {
	public static void main(String args[]) {
		// main try-block
		try {
			// try-block2
			try {
				// try-block3
				try {
					int arr[] = { 34, 62, 37, 44 };
					
					System.out.println(arr[32]);
				} catch (ArithmeticException e1) {
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in try-block3");
				}
			} catch (ArithmeticException e2) {
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in try-block2");
			}
		} catch (ArithmeticException e3) {
			System.out.print("Arithmetic Exception");
			System.out.println(" handled in main try-block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.print("ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		} catch (Exception e5) {
			System.out.print("Exception");
			System.out.println(" handled in main try-block");
		}
	}

}
