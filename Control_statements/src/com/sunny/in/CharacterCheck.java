package com.sunny.in;

import java.util.Scanner;

public class CharacterCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character::");
		char ch = sc.next().charAt(0);
		if (Character.isLetter(ch)) {
			System.out.println(ch + " is a alphabet");
		} else if (Character.isDigit(ch)) {
			System.out.println(ch + " is a digit");
		} else {
			System.out.println("is either alphabet or nor a digit");
		}

	}

}
