package com.javasession.week.two.oop;

public class Student extends Dept {
	String mainSub = "Math";

	public static void main(String[] args) {
		Student dp = new Student();
		System.out.println(dp.designation);
		System.out.println(dp.nameOfDept);
		System.out.println(dp.mainSub);

	}

}

class Dept {

	String designation = "tutor";
	String nameOfDept = "Tech";

	void does() {
		System.out.println("teaching");
	}

}
