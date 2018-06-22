package com.javasession.week.two.oop;

public class AbsractionsSample {

	private int num = 10;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String str = "Test";

	public static void main(String[] args) {

		AbsractionsSample ab = new AbsractionsSample();
		ab.setNum(20);
		System.out.println((int) ab.getNum());

	}

}
