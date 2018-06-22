package com.javasession.polymorphisum;

public class Cat extends Animal{
	public static void main(String[] args) {
		
		Cat ct = new Cat();
		ct.someofall();
		
	}
		
	@Override
	public void sound() {
		System.out.println("Sound of an cat");
	}
	
	@Override
	public void move() {
		System.out.println("cat move");
	}

}
