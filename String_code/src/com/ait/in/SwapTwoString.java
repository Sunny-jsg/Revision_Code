package com.ait.in;

public class SwapTwoString {
	public static void main(String[] args) {
		//without using third variable
		String a = "java";// 4
		String b = "program";// 7
		a = a + b;// javaprogram 11
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("a" + "=" + a);
		System.out.println("b" + "=" + b);

	}

}
