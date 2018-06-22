package com.javasession.polymorphisum;

public class MethodOverLoad extends OverLoad {
	public static void main(String[] args) {

		OverLoad ov = new OverLoad();
		double result;

		ov.demo(10);
		ov.demo(12, 34);

		result = ov.demo(10.4);
		System.out.println("OOP" + result);

		DisplayOverLoading overLoad = new DisplayOverLoading();
		overLoad.desp('A');
		overLoad.desp('B', 45);

		Const ct = new Const();
		Const ct1 = new Const(12, 45, 45, true);
		Const ct2 = new Const(23, 45, 45, true);

	}
	@Override
	public  void demo(int a, int b) {
		System.out.println("A + B " + a + "," + b );
	}

}
