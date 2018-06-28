package com.javasession.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SampleTest {

	public static void main(String[] args) {

		callToProductClass();
		getUnionOfSetValues();

	}

	public static void callToProductClass() {
		Products<String, String> p1 = new Products<>("Phone", "Iphone");
		String str = p1.getItem1();
		String str1 = p1.getItem2();
		System.out.println(p1);
	}

	public static void getUnionOfSetValues() {
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");

		Set<String> mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		mySet2.add("PA");

		Set<String> resultSet = unionOfSets(mySet1, mySet2);

		Iterator<String> it = resultSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static <E> Set<E> unionOfSets(Set<E> mySet1, Set<E> mySet2) {
		Set<E> results = new TreeSet<>();
		results.addAll(mySet1);
		results.addAll(mySet2);

		return results;
	}

}
