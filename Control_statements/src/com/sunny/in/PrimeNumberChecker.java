package com.sunny.in;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER::");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");
		}
	}

}
