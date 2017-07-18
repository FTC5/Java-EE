package com.gmail.m1512.dan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		num = sc.nextInt();
		sc.close();
		a = num % 10;
		b = num % 100 / 10;
		c = num % 1000 / 100;
		if (a != num / 100000) {
			System.out.println("Number is not a palindrome");
		} else if (b != num / 10000 % 10) {
			System.out.println("Number is not a palindrome");
		} else if (c != num / 1000 % 10) {
			System.out.println("Number is not a palindrome");
		} else {
			System.out.println("Number is a palindrome");
		}
	}

}
