package com.sunny.in;

public class Demo5 {
	public static void main(String[] args) {
		int[] arr = { 40, 55, 23, 18, 87, 34, 12 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				//int x = arr[i];
				//int y = arr[j];
				if (arr[i]< arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
