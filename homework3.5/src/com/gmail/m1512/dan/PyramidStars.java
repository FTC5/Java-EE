package com.gmail.m1512.dan;

import java.util.Scanner;

public class PyramidStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a;
		int b;
		b = 1;
		a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			if (a == i && b != num) {
				System.out.println("*");
				a++;
				b++;
				i = 0;
			} else if (a == i) {
				System.out.println("*");
				a--;
				i = 0;
			} else if (a == 0) {
				i = num;
			} else {
				System.out.print("*");
			}
		}

	}

}
