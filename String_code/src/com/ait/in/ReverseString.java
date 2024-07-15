package com.ait.in;

public class ReverseString {
	public static void main(String[] args) {
		String s = "java";
		char[] ch = s.toCharArray();
		// String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			// rev = rev + s.charAt(i);

			System.out.print(ch[i]);

		}

	}

}
