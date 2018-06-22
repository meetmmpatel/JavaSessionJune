package com.javasession.week.two.oop;

import java.util.*;

import com.javasession.week.two.tryandcatch.*;

public class SampleTestclass  {
	int num;
	String str;
	boolean b1;
	
	public static void main(String[] args) {
		
		getOne();
		System.out.println(sumOfall(6, 89));
		
		
	}
	
	static void getOne() {
		System.out.println("Say Hello");
	}
	
	private static int sumOfall(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public static void message () {
		System.out.println("Some test message");
		
	}

}
