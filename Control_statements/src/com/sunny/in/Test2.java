package com.sunny.in;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int num = sc.nextInt();
		if (num < 100) {
			System.out.println("given number below 100!!");
			if (num % 2 == 0) {
				System.out.println("given number is EVEN");
			} else {
				System.out.println("given number is ODD");
			}
		} else {
			System.out.println("given number is not below 100 !!");
		}
	}

}
