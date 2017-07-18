package com.gmail.m1512.dan;

import java.util.Scanner;

//import java.util.Scanner;

public class PointInTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 6
		double s;
		double s1;
		double s2;
		double s3;
		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x");
		x = sc.nextDouble();
		System.out.println("Input y");
		y = sc.nextDouble();
		sc.close();
		s = Math.abs(((4 - 0) * (1 - 0) - (6 - 0) * (4 - 0)) / 2);
		s1 = Math.abs(((4 - 0) * (y - 0) - (x - 0) * (4 - 0)) / 2);
		s2 = Math.abs(((4 - x) * (1 - y) - (6 - x) * (4 - y) / 2));
		s3 = Math.abs(((x - 0) * (1 - 0) - (6 - 0) * (y - 0)) / 2);
		if (s == s1 + s2 + s3) {
			System.out.println("The point is in Triangle");
		} else if (4 * y - 4 * x == 0) {
			System.out.println("The point is in Triangle");
		} else if (6 * y - x == 0) {
			System.out.println("The point is in Triangle");
		} else if (2 * y + 3 * x - 20 == 0) {
			System.out.println("The point is in Triangle");
		} else {
			System.out.println("The point is not in Triangle");
		}
	}
}
