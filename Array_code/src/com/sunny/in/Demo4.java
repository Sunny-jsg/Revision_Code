package com.sunny.in;

public class Demo4 {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 2, 1, 3, 4, 5 };
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(nums[i] + " ");
			}
		}

	}
}
