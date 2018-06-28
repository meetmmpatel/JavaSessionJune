package com.javasession.lambda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTestAnswer {

	public static void main(String[] args) {

		List<Person> pl = Arrays.asList(

				new Person("Mike", "Chamber", 65), 
				new Person("Sam", "Smith", 34), 
				new Person("Josh", "Nesh", 78),
				new Person("Garry", "Austin", 34), 
				new Person("Carter", "Green", 45), 
				new Person("Jim", "Neil", 36));

		// 1. Sort by lastName
		
		
		Collections.sort(pl, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//2. Create method that can print all the element in the list 
		
		printAll(pl);
		
		
		//3. Create method that print person with only last name starts with 'N'
		System.out.println("====== Last Name with N =======");
		printLastNameWithN(pl);

		/*
		 * 1. Sort List by last name 
		 * 2. Create method that can print all the element in the list 
		 * 3. Create method that print person with only last name starts with 'N'
		 */

	}

	private static void printLastNameWithN(List<Person> pl) {
		for(Person p: pl) {
			if (p.getLastName().startsWith("N")) {
				
				System.out.println(p);
			}
//			else {
//				System.out.println("There is no Last name that starts with N ");
//			}
		}
		
		
	}

	public static void printAll(List<Person> pl) {

		// 2. Create method that can print all the element in the list
		for (Person p : pl) {
			System.out.println(p);
		}

	}

}
