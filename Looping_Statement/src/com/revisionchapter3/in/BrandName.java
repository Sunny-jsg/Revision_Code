package com.revisionchapter3.in;

import java.util.Scanner;

public class BrandName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER BRAND NAME::");
		String brand = sc.next();
		switch (brand) {
		case "Nike":
			System.out.println("just do it");
			break;
		case "Adidas":
			System.out.println("impossible is nothing");
			break;
		case "Puma":
			System.out.println("forever faster");
			break;
		case "Reebok":
			System.out.println("i am what i am");
			break;
		default:
			System.out.println("Brand not found");
			break;

		}
	}

}
