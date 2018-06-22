package com.javasession.AbstractClass;

abstract class Animal {

	public abstract void sound();
	public abstract void move();

	public void myMethod() {
		System.out.println("Hello");
	}
}

public class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat sound");
	}

	public static void main(String[] args) {
		Animal ob = new Cat();
		ob.sound();
		ob.move();
	}

	@Override
	public void move() {
		System.out.println("Cat Moves");
		
		
	}

}
