package com.javasession.map;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

	public static void main(String[] args) {

		Map<String, String> lng = new HashMap<>();

		lng.put("Java", "OOP Language");
		lng.put("C++", "Good Scirpting language");
		lng.put("JS", "Best for Web Development");

		System.out.println(lng.get("Java"));

		lng.put("Java", "Supported by Oracle");
		System.out.println(lng.get("Java"));

		// For particular key there is always one value in map
		// Also you can check if the value is there or not

		if (lng.containsKey("SQL")) {
			System.out.println("SQL is already there");
		}
		else {
			lng.put("SQL", "It's language for database");
		}

		System.out.println("Checking the value only " + lng.containsValue("Good Scirpting language"));

		System.out.println(lng.containsKey("SQL")); // it's return true

		System.out.println(lng.get("SQL"));

		System.out.println("===================");
		// HashMap will not preserve insertion order

		for (String key : lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));

		}

		System.out.println("===================");

		System.out.println(lng.remove("SQL"));

		// Or you can only remove is Key and value both match

		if (lng.remove("Java", "OOP Language")) {
			System.out.println("removed java lang");
		}
		else {
			System.out.println("Since Key and Value does not match it will not delete the object");
		}

		System.out.println("===================");
		for (String key : lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));

		}

		lng.put("SQL", "It's database query language");
		lng.put("SQL", "It's also supports open source database");
		// it will only insert last key as Key has to be unique in hash map.

		System.out.println("===== Adding two SQL Keys and Values ======");
		for (String key : lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));

		}

		System.out.println("===== About replacing Key and values");
		lng.replace("Java", "It's supports Lamda expression");
		lng.replace("Scala", "it's big data language"); // this will add key element since key does not exist.

		for (String key : lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));

		}

		System.out.println("===================");
		System.out.println("check to see if map is empty or not:  =  " + lng.isEmpty());
		System.out.println("Remove all ");
		lng.clear();
		System.out.println("check to see if map is empty or not:  =  " + lng.isEmpty());

	}

}
