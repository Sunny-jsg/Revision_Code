package com.ait.in;

public class RemoveAllVowels {
	public static void main(String[] args) {
		String s = "Hello,i love my india";
		String s1 = s.replaceAll("[aeiou]", "");
		System.out.println(s1);
	}

}
