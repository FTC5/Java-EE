package com.gmail.m1512.dan;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Side A");
		a = sc.nextInt();
		System.out.println("Side B");
		b = sc.nextInt();
		System.out.println("Side C");
		c = sc.nextInt();
		sc.close();
		if (a + b > c) {
			System.out.println("Triangle does not exist");
		} else if (a + c < b) {
			System.out.println("Triangle does not exist");
		} else if (c + b < a) {
			System.out.println("Triangle does not exist");
		} else if (a + b < c) {
			System.out.println("Triangle does not exist");
		} else {
			System.out.println("Triangle  exist");
		}
	}
}
