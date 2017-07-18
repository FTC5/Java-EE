package com.gmail.m1512.dan;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int x;
		int c;
		int v;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input x");
		x = sc.nextInt();
		System.out.println("Input c");
		c = sc.nextInt();
		System.out.println("Input v");
		v = sc.nextInt();
		max = a;
		if (max < x) {
			max = x;
		}
		if (max < c) {
			max = c;
		}
		if (max < v) {
			max = v;
		}
		System.out.println("MAX =" + max);
		sc.close();
	}

}
