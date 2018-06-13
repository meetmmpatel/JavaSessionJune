package com.javasession.week.two.tryandcatch;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in);) {
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());

			}

		}

	}

}