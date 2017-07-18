package com.gmail.m1512.dan;

import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x:");
		x = sc.nextDouble();
		System.out.println("Input y:");
		y = sc.nextDouble();
		sc.close();
		x = Math.pow(x, 2);
		y = Math.pow(y, 2);
		if (Math.sqrt(x + y) <= 4) {
			System.out.println("The point is in Circle");
		} else {
			System.out.println("The point is not in Circumference");
		}
	}
}
