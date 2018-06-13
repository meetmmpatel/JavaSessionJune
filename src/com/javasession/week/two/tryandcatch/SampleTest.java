package com.javasession.week.two.tryandcatch;

public class SampleTest {

	public static void main(String[] args) {
		System.out.println("checkt the bonus durarion");
		checkEligibity(13,99);
		
		
	}
	
	static void checkEligibity(int empId, int empNum) {
		if (empId < 12 && empNum < 40) {
			throw new ArithmeticException("Not eligible for bonus");
			
		}
		else {
			System.out.println("Eligible for bonus");
		}
		
		
	}

}
