package com.sunny.in;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER::");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("given number is EVEN number!!");
		} else {
			System.out.println("given number is ODD number");
		}
	}

}
