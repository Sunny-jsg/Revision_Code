package com.ashokit.in;

import java.util.Scanner;

public class Demo2 {
	// write a java program to take two string input

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME::");
		String fname = sc.next();
		System.out.println("ENTER SECOND NAME::");
		String lname = sc.next();
		String fullname = fname + lname;
		System.out.println(fullname);
		sc.close();
	}

}
