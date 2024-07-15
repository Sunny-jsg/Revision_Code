package com.ait.in;

public class Palindrome {
	public static void main(String[] args) {
		String s = "java";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}

	}

}
