package com.sunny.in;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int arm = 0;
		int rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int n = sc.nextInt();
		int c = n;
		while (n > 0) { 
			rem = (n % 10);
			arm = (rem * rem * rem) + arm;
			n = n / 10;

		}
		if (c == arm) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
