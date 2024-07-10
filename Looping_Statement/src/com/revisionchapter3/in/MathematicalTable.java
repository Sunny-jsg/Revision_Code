package com.revisionchapter3.in;

import java.util.Scanner;

public class MathematicalTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER::");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}

}
