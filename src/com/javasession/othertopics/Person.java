package com.javasession.othertopics;

public class Person {
	
	int age;
	int hight;
	
	Person(){
		System.out.println("This is person");
	}

	 Person(int age, int hight) {
		super();
		this.age = age;
		this.hight = hight;
	}
	
	
	

}

class Child extends Person{
	
	Child(){
		super();
		
		
	}
	
}