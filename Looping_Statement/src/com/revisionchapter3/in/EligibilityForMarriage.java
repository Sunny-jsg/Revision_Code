package com.revisionchapter3.in;

import java.util.Scanner;

public class EligibilityForMarriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER AGE::");
		int age = sc.nextInt();
		System.out.println("ENTER SALARY::");
		double salary = sc.nextDouble();
		if (age < 30 && salary >= 100000) {
			System.out.println("eligible for marriage");
		} else {
			System.out.println("not eligible for marriage");
		}

	}

}
