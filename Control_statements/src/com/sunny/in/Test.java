package com.sunny.in;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ::");
		int num = sc.nextInt();
		if (num % 5 == 0) {
			System.out.println("we are inside the if-block");
			System.out.println("given number is divisible by 5!!");
		}
		System.out.println("we are outside the if-block");
	}

}
