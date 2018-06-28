package com.javasession.lambda;

@FunctionalInterface
public interface ForJustLambdaOnly {

	// For normal interface you are allowed to declare more than one Abstract method
	// however when you have more then one Abstract method your lambda function will
	// not work
	// What if you have implemented lambda functions with that later on someone add
	// more than one abstract method.

	// In Functional interface you are only allowed to have one Abstract method.

	void sumOfAll();
	

	default int sumOfMultiply() {
		return 0;
	}

}
