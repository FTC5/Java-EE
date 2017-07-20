package com.gmail.m1512.dan;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int num;
		int factorial;
		factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		num = sc.nextInt();
		sc.close();
		if (num > 4 && num < 16) {
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			System.out.println("Factorial number " + num + " is " + factorial);
		} else {
			System.out.println("Error");
		}
	}
}
