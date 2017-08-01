package com.gmail.m1512.dam;

import java.util.Arrays;

public class OutArrys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 213, 4, 23, 2 };
		System.out.println(Arrays.toString(num));
		StringOut(num);
	}

	static void StringOut(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + " ,");
			} else {
				sb.append(arr[i] + "]");
			}
		}
		String text = sb.toString();
		System.out.println(text);
	}
}
