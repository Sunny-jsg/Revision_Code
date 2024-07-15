package com.ait.in;

import java.util.Arrays;

public class Method2 {
	public static void main(String[] args) {
		String s = "Sunny";
		String s1 = "Yadav";
		String str = "   jharsududa    ";
		String str2 = "Hii@Sunny@How@Are@You";
		String s2 = s.concat(s1);
		System.out.println(s2);
		if (s.equals(s1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		String s3 = s.replace("unny", "onu");
		System.out.println(s3);
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('n'));
		System.out.println(str.substring(0, 5));
		String[] split = str2.split("@");
		System.out.println(Arrays.toString(split));
		String trim = str.trim();
		System.out.println(trim);
	}

}
