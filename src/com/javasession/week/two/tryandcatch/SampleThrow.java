package com.javasession.week.two.tryandcatch;

public class SampleThrow {
	
	public static void main(String[] args) {
		
		eligibility(4, 50);
		
	}
	
	static void eligibility(int empId, int num) {
		
		if (empId < 24 && num < 55) {
			throw new ArithmeticException("Not eligible for bonus");
		}
		else {
			System.out.println("Elibible for bonus");
		}
		
		
	}

}
