package com.sunny.in;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER::");
		char ch = sc.next().charAt(0);
		if (Character.isAlphabetic(ch)) {
			System.out.println("alphabet");
		} else if (Character.isDigit(ch)) {
			System.out.println("digit");
		} else {
			System.out.println("neither alphabet or nor digit");
		}
	}

}
