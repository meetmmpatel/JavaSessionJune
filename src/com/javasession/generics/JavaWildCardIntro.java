package com.javasession.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaWildCardIntro {

	public static void main(String[] args) {

		// you can assign Object to any java class
		Object myObj = new Object();
		String str = "hello";
		myObj = str;
		System.out.println(myObj);

		// even for model class
		Employee emp = new Employee();
		Accountant acct = new Accountant();
		emp = acct;

		// however you can't assign any collection class the same.
		ArrayList<Employee> arrList1 = new ArrayList<>();
		arrList1.add(new Employee());
		ArrayList<Accountant> arrList2 = new ArrayList<>();
		arrList2.add(new Accountant());
		// As you can see you can't assign one list to another
		// arrList1 = arrList2; getting an error

		// now the sample of wild card
		// it's started with ? as symbol
		ArrayList<?> arr = new ArrayList<>();
		arr = arrList2;
		// as you can see no problem. but still it's very loose typing

		// Sample for Upper bound wild card
		// it's only allowed Supper and child class as type only
		ArrayList<? extends Employee> arrUpper = new ArrayList<>();
		ArrayList<Accountant> acctUpper = new ArrayList<>();
		arrUpper = acctUpper;
		

		// Sample for Lower bound wild card
		// it's only allowed all Super class it's parent of Super class
		ArrayList<? super Employee> arrLower = new ArrayList<>();
		ArrayList<Object> arrObj = new ArrayList<>();
		arrLower = arrObj;
		// it will work since Object is super class of Employee

		makeEmplyeeWork(arrList1);
		makeEmplyeeWork(arrList2);

	}

	public static void makeEmplyeeWork(List<? extends Employee> emp) {
		for (Employee em : emp) {
			em.work();

		}

	}

}

class Employee {
	public void work() {
		System.out.println("Employee workging");
	}

}

class Accountant extends Employee {

	@Override
	public void work() {
		System.out.println("Account working");

	}

}