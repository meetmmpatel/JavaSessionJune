package com.javasession.othertopics;

public class Emp extends Human {
	public static void main(String[] args) {

		Human obj = new Emp();
		Human obj2 = new Human();

		obj.walk();
		obj2.walk();

	}

	public void walk() {
		System.out.println("Emp can walk");
	}

}

class Human {

	public void walk() {
		System.out.println("Human can walk");
	}
}
