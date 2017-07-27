package com.gmail.m1512.dan;

import java.util.Arrays;

public class Mass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5 };
		reshuffle(numbers);
	}

	static void reshuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.println(Arrays.toString(arr));
				int tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}
		}
	}
}
