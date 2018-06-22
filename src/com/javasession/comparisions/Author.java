package com.javasession.comparisions;

public class Author implements Comparable<Author> {

	String firstName;
	String lastName;
	String bookName;

	public Author(String firstName, String lastName, String bookName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	@Override
	public int compareTo(Author au) {
		/*
		 * Sorting by last name. compareTo should return < 0 if this(keyword) is
		 * supposed to be less than au, > 0 if this is supposed to be greater than
		 * object au and 0 if they are supposed to be equal.
		 */
		int last = this.lastName.compareTo(au.lastName);
		// Sorting by first name if last name is same arguments
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;

	}

}
