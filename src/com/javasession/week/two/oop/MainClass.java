package com.javasession.week.two.oop;

class MainClass {
	
	MainClass(){
		System.out.println("From Main class");
	}
	
	void decp() {
		System.out.println("Main Mehtod from Main class");
	}
	public static void main(String[] args) {
		Example ex = new Example();
		ex.decp();
	}
	

}

class Example extends MainClass{
	Example(){
		System.out.println("From Example class");
	}
	void decp() {
		System.out.println("Mehtod From Example class");
		super.decp();
	}
	
	
	
	
	
}
