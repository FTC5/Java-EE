package com.gmail.m1512.dan;

import java.util.Scanner;

public class Apartment {

	public static void main(String[] args) {
		int numapartment;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the number of the apartment :");
		numapartment = sc.nextInt();
		sc.close();
		if (numapartment < 144) {
			a = numapartment / 36;
			if (a == 0) {
				System.out.println("Entrance number: 1, floor number:" + numapartment % 36 / 4);
			} else if (a == 1) {
				System.out.println("Entrance number: 2, floor number:" + numapartment % 36 / 4);
			} else if (a == 2) {
				System.out.println("Entrance number: 3, floor number:" + numapartment % 36 / 4);
			} else if (a == 3) {
				System.out.println("Entrance number: 4, floor number:" + numapartment % 36 / 4);
			}
		} else {
			System.out.println("ERROR");
		}
	}

}
