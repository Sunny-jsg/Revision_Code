package com.sunny.in;

public class Demo {
	public static void main(String[] args) {
		int rows = 5; // The number of rows to print
		printPascalsTriangle(rows);
	}

	public static void printPascalsTriangle(int rows) {
		int[][] triangle = new int[rows][rows];

		// Populate the Pascal's Triangle
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}
