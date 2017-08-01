package com.gmail.m1512.dan;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number");
		num = sc.nextLine();
		sc.close();
		System.out.println(binary(num));

	}

	static int binary(String text) {
		int num = Integer.parseInt(text);
		int sum = 0;
		int n = 0;
		for (int i = 0; i < text.length(); i++) {
			n = num % 10;
			if (n == 1) {
				sum += Math.pow(2, i);
				num /= 10;
			} else if (n == 0) {
				num /= 10;
			} else {
				System.out.println("Error");
				return 0;
			}
		}
		return sum;
	}
}
