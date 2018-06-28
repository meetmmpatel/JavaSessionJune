package com.javasession.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTestAnswerLambda {
	public static void main(String[] args) {

		List<Person> pl = Arrays.asList(

				new Person("Mike", "Chamber", 65), new Person("Sam", "Smith", 34), new Person("Josh", "Nesh", 78),
				new Person("Garry", "Austin", 34), new Person("Carter", "Green", 45), new Person("Jim", "Neil", 36));

		// 1. Sort by lastName

		Collections.sort(pl, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		// Since Java compiler knows this Datat type is List we do not need to specify
		// Person p1 and Person p2

		// 2. Create method that can print all the element in the list

		printAll(pl);

		// 3. Create method that print person with only last name starts with 'N'
		System.out.println("====== Last Name with N =======");
		printLastNameWithN(pl);

	}

	private static void printLastNameWithN(List<Person> pl) {
		for (Person p : pl) {
			if (p.getLastName().startsWith("N")) {

				System.out.println(p);
			}

		}

	}

	public static void printAll(List<Person> pl) {

		// 2. Create method that can print all the element in the list
		for (Person p : pl) {
			System.out.println(p);
		}

	}

}
