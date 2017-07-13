package com.gmail.m1512.dan;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius;
		double circ;
		System.out.println("Radius of a circle =");
		radius = sc.nextDouble();
		sc.close();
		circ = 2 * radius * Math.PI;
		System.out.println("Circumference =" + circ);
	}

}
