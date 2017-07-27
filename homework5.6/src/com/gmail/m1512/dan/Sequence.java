package com.gmail.m1512.dan;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers");
		line = sc.nextLine();
		System.out.println("Next number" + nummass(line));

	}

	static int nummass(String text) {
		String[] t = text.split("[,.; ]");
		int n = t.length;
		int[] numbers = new int[n];
		for (int i = 0; i < t.length; i++) {
			numbers[i] = Integer.parseInt(t[i]);
		}
		return combinationOne(numbers);
	}

	static int combinationOne(int[] arr) {
		int num;
		num = arr[1] - arr[0];
		if (arr[1] + num == arr[2]) {
			return arr[arr.length - 1] + num;
		} else {
			return combinationTwo(arr);
		}
	}

	static int combinationTwo(int[] arr) {
		int num = 0;
		num += arr[1] / arr[0];
		if (arr[1] * num == arr[2]) {
			return arr[arr.length - 1] * num;
		} else {
			return combinationThree(arr);
		}
	}

	static int combinationThree(int[] arr) {
		double num = 0.0;
		int numtwo = 0;
		num = Math.sqrt(arr[1]) - Math.sqrt(arr[0]);
		if (num == 1.0) {
			numtwo += Math.pow(Math.sqrt(arr[arr.length - 1]) + 1, 2);
			return numtwo;
		} else {
			return combinationFour(arr);
		}
	}

	static int combinationFour(int[] arr) {
		int num = 0;
		int numtwo = 0;
		num += Math.cbrt(arr[1]) - Math.cbrt(arr[0]);
		if (num == 1) {
			numtwo += Math.pow(Math.cbrt(arr[arr.length - 1]) + 1, 3);
			return numtwo;
		} else {
			System.out.println("Error");
			return 0;
		}
	}
}
