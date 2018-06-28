package com.javasession.lambda;

public class TypeInterfaceLambda {
	public static void main(String[] args) {
		StringLength sl = str -> str.length();
		System.out.println(sl.getSize("This is lambda witth inner interface"));
		printSize(sl);
	}

	// You can also pass lambda as data input parameter in any methods

	public static void printSize(StringLength slength) {
		System.out.println(slength.getSize("This is lambda method parameter"));

	}

	interface StringLength {
		int getSize(String str);
	}

}
