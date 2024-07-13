package com.sunny.in;

public class AddArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 12, 14, 18, 23, 22 };
		for (int i : arr) {
			sum = sum + i;

		}
		System.out.println(sum);
	}

}
