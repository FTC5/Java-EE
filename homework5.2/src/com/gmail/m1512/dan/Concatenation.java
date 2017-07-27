package com.gmail.m1512.dan;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		double dnum = 0;
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		num = sc.nextInt();
		System.out.println("Input double number");
		dnum = sc.nextDouble();
		System.out.println("Input text");
		text = sc.next();
		System.out.println(line(num, dnum, text));
		sc.close();
	}

	static String line(int a, double b, String text) {
		double sum;
		sum = a + b;
		String line = text + sum;
		return line;
	}
}
