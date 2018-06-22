package com.javasession.polymorphisum;

public class Horse extends Animal {

	public static void main(String[] args) {
		
		Horse obj = new Horse();
		obj.sound();
		obj.someofall();
		
		
		
	}

	@Override
	public void sound() {
		System.out.println("Sound of Horse");
	}

	@Override
	public void move() {
		System.out.println("Hourse move");
	}

}
