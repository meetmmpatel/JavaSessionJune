package com.javasession.AbstractClass;

public class DemoInterface implements MyInterface, SecoundInterface {

	@Override
	public void method1() {
		System.out.println("This is method one");
	}
	@Override
	public void method2() {
		System.out.println("This is method two");
	}
	public static void main(String[] args) {

		MyInterface oj = new DemoInterface();
		oj.method1();
		oj.method2();

		SecoundInterface oj1 = new DemoInterface();
		oj1.method3();
	}
	@Override
	public void method3() {
		System.out.println("This is method three");
	}
}

interface MyInterface {
	public void method1();
	public void method2();
}

interface SecoundInterface {
	public void method3();

}
