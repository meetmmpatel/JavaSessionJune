package com.javasession.week.two.tryandcatch;

public class CustomExceptions {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			throw new MyException("this is from my excptions class");
			
		} catch (Exception e) {
			System.out.println("Catch block");
			System.out.println(e);
		}

	}

}

class MyException extends Exception {
	String str1;

	public MyException(String str2) {
		str1 = str2;

	}

	public String toString() {
		return ("My Exceptions" + str1);
	}

}
