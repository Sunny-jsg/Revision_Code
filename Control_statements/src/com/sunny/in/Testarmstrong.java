package com.sunny.in;

import java.util.Scanner;

public class Testarmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int num = sc.nextInt();
		int arm = 0;
		int rem = 0;
		int c = num;
		while (num > 0) {
			rem = (num % 10);
			arm = (rem * rem * rem) + arm;
			num = num / 10;

		}
		if (c==arm) {
			System.out.println("Armstrong Number");
			
		}else {
			System.out.println("Not armstrong number");
		}
	}

}
