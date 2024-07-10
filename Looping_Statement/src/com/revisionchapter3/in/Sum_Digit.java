package com.revisionchapter3.in;

import java.util.Scanner;

public class Sum_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
