package com.javasession.comparisions;

import java.util.ArrayList;
import java.util.Collections;

public class SortingPersonByMany {
	public static void main(String args[]) {
		// List of objects of Author class
		ArrayList<Person> pl = new ArrayList<Person>();
		pl.add(new Person("Henry", "Tropic", 45));
		pl.add(new Person("Nalo", "Brown", 56));
		pl.add(new Person("Frank", "Smith", 65));
		pl.add(new Person("Deborah", "Sky", 51));
		pl.add(new Person("George R. R.", "GOT", 62));
		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class person
		 */
		System.out.println("Sorting by Person First Name:");
		System.out.println("======================");
		Collections.sort(pl);
		for (Person au : pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() + ", " + au.getAuAge());
		}
		/* Sorting using PersonAgeComparator */
		System.out.println("======================");
		System.out.println("Sorting by Person Age:");
		Collections.sort(pl, new PersonAgeComparator());
		for (Person au : pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() + ", " + au.getAuAge());
		}
		/* Sorting using LastName Comparator */
		System.out.println("======================");
		System.out.println("Sorting by Last Name:");
		Collections.sort(pl, new PersonNameComparator());
		for (Person au : pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() + ", " + au.getAuAge());
		}
	}

}
