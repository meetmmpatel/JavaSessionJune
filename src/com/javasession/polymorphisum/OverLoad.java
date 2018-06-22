package com.javasession.polymorphisum;

public class OverLoad {
	
	private void demo(int a) {
		System.out.println( "A: " + a);
		
	}
	protected  void demo(int a, int b) {
		System.out.println("A + B " + a + "," + b );
	}
	public double demo(double a) {
		System.out.println("Double A" + a);
		return a * a;
		
	}

}
