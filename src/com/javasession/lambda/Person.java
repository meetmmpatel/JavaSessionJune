package com.javasession.lambda;

public class Person {

	private String frirstName;
	private String lastName;
	private int age;
	
	/*
	 * 1. Sort List by last name 
	 * 2. Create method that can print all the element in the list 
	 * 3. Create method that print person with only last name starts with 'N'
	 */

	public Person(String frirstName, String lastName, int age) {
		super();
		this.frirstName = frirstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFrirstName() {
		return frirstName;
	}

	public void setFrirstName(String frirstName) {
		this.frirstName = frirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [frirstName=" + frirstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
