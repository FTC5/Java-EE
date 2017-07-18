package com.gmail.m1512.dan;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input age :");
		age = sc.nextInt();
		sc.close();
		if (age % 400 == 0) {
			System.out.println("366 days!");
		} else if (age % 4 == 0 && age % 100 != 0) {
			System.out.println("366 days!");
		} else {
			System.out.println("365 days!");
		}
	}
}
