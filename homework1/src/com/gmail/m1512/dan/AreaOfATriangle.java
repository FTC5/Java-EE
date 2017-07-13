package com.gmail.m1512.dan;

import java.util.Scanner;

public class AreaOfATriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side1;
		double side2;
		double side3;
		double s;
		double p;
		System.out.println("side 1 =");
		side1 = sc.nextDouble();
		System.out.println("side 2 =");
		side2 = sc.nextDouble();
		System.out.println("side 3 =");
		side3 = sc.nextDouble();
		sc.close();
		p = (side1 + side2 + side3) / 2;
		s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		System.out.println("Area of a triangle =" + s);
	}

}
