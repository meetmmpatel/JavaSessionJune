package com.javasession.lambda;

public class SampleLambda {

	public static void main(String[] args) {

		HelloLambda hm = () -> System.out.println("Print Lambda!");
		hm.someMethod();

		AddLambda am = (int a, int b) -> a + b;
		System.out.println(am.addSum(6, 9));

		// if the interface is not functional interface lambda will not support two
		// abstract methods in same interface class.
		// Lambda is most part the short cut of inner class but it not the same as inner
		// class.

	}

}

@FunctionalInterface
interface HelloLambda {
	void someMethod();

	default int sumOfAll(int a, int b) {
		return 0;
	}
}

interface AddLambda {
	int addSum(int a, int b);
}
