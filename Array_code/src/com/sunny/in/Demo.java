package com.sunny.in;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int num = sc.nextInt();
		boolean IsInArray = false;
		int[] arr = { 23, 43, 56, 76, 65, 89, 63, 10, 21, 22 };
		for (int i : arr) {
			if (num == i) {
				IsInArray = true;
				break;
			}

		}
		if (IsInArray) {
			System.out.println("Given Number Is Available In Array");
		} else {
			System.out.println("not");
		}
	}

}
