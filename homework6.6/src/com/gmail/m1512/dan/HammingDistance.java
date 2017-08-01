package com.gmail.m1512.dan;

import java.util.Scanner;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne;
		int numTwo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number 1");
		numOne = sc.nextInt();
		System.out.println("Input number 2");
		numTwo = sc.nextInt();
		sc.close();
		String text = transfer(numOne) + "_" + transfer(numTwo);
		System.out.println("Hamming distance is" + texttwo(text));
	}

	static String transfer(int num) {
		String number = num % 2 + " ";
		num /= 2;
		for (; num != 0;) {
			number += num % 2 + " ";
			num /= 2;
		}
		return number;
	}

	static int texttwo(String text) {
		String[] number = text.split("[_]");
		System.out.println(number[0]);
		System.out.println(number[1]);
		String[] numone = number[0].split("[ ]");
		String[] numtwo = number[1].split("[ ]");
		return HammDistance(numone, numtwo);

	}

	static int HammDistance(String[] one, String[] two) {
		int sum = 0;
		int max = two.length;
		int min = one.length;
		if (one.length > two.length) {
			max = one.length;
			min = two.length;
		}
		for (int i = 0; i < max; i++) {
			if (min == one.length && i >= min) {
				sum += Integer.parseInt(two[i]);
			} else if (min == two.length && i >= min) {
				sum += Integer.parseInt(one[i]);
			} else if (Integer.parseInt(one[i]) != Integer.parseInt(two[i])) {
				sum += Integer.parseInt(one[i]) + Integer.parseInt(two[i]);
				System.out.println(sum + " " + Integer.parseInt(one[i]) + " " + Integer.parseInt(two[i]));
			}
		}
		return sum;
	}

}
