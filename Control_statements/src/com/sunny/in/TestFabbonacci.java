package com.sunny.in;

import java.util.Scanner;

public class TestFabbonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
