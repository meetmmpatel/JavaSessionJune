package com.javasession.week.two.tryandcatch;

import java.io.IOException;

public class ThrowsSampleCode  {
	public static void main(String[] args) {
		try {
			Example ex = new Example();
			ex.myMethod(3);
			
		} catch (Exception e) {
		System.out.println(e);
		}

	}

}

class Example {

	void myMethod(int num) throws IOException,ClassNotFoundException  {
		if (num == 1)
			throw new IOException("IO exceptions");
		else
			throw new ClassNotFoundException("Class Not Found exceptions");

	}

}
