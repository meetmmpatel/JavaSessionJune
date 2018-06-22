package com.javasession.othertopics;

public class SubClass extends SuperClass {

	int someNum = 25;

	void printNumber() {
		System.out.println(super.someNum);
	}
	void display() {
		System.out.println("From Sub class");
	}
	
	void printMag() {
		display();
		super.display();
	}

	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.printNumber();
		sb.printMag();
	}

}

class SuperClass {
	int someNum = 20;
	
	void display() {
		System.out.println("From super class");
	}

}
