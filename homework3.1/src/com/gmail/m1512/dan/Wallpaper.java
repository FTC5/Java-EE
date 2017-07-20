package com.gmail.m1512.dan;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lenght;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input wallpaper lenght");
		lenght = sc.nextInt();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < lenght; i++) {
				if (i % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
