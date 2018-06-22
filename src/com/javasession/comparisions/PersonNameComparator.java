package com.javasession.comparisions;

import java.util.Comparator;

public class PersonNameComparator  implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.lastName.compareTo(p2.lastName); 
	}
	

}
