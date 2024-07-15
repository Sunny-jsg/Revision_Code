package com.ait.in;

public class EachWordReverse {
	public static void main(String[] args) {
		String s = "Hello My Friend";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String c = s1[i];
			StringBuffer sb = new StringBuffer(c);
			sb.reverse();
			System.out.print(sb);
		}

	}

}
