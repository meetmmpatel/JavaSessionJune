package com.javasession.lambda;

public class BasicLambda {

	public static void main(String[] args) {

	}

	public void sayHello() {
		System.out.println("Hello!");
	}

	public double doubleRet(double a, double b, double d) {
		return a + b;
	}

	double doubleReturn = doubleRet(23, 45, 56.78);

	/*
	 * sayHello = () -> { System.out.println("Hello!"); } perform(() ->
	 * {System.out.println("Hello!"); )
	 * 
	 * you also skip word return if the it's in one line Eg. doubleNumberFuction =
	 * (int a) -> a * 2; Eg. IntReturnFunction = (int a , int b) -> a + b;
	 * 
	 * what if there is logic that i need to return safeDivision = (int a , int b)
	 * -> { if (b == 0) return 0; else return a/b ;}
	 * 
	 * findStrLength = (String s) -> s.length();
	 * 
	 */

}
