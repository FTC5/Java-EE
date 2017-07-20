package com.gmail.m1512.dan;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int b;
		int a;
		a = 0;
		b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		num = sc.nextInt();
		sc.close();
		if (num % 2 != 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 1; j <= num; j++) {
					if (b == 0) {
						System.out.print("*");
					} else if (j <= num - b || j > b) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				if (b == 0) {
					b = num - 1;
				} else if (a < num / 2) {
					b--;
				} else {
					b++;
				}
				a++;

				System.out.println();
			}
		} else {
			System.out.println("Error");
		}
	}

}
