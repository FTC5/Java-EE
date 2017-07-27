package com.gmail.m1512.dan;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int searchNum = 0;
		int[] numbers = new int[10];
		rand(numbers);
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(numbers));
		System.out.println("Input Search number");
		searchNum = sc.nextInt();
		sc.close();
		System.out.println("index =" + search(numbers, searchNum));
	}

	static void rand(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100.0);
		}
	}

	static int search(int[] arr, int s) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				return i;
			}
		}
		return -1;
	}

}
