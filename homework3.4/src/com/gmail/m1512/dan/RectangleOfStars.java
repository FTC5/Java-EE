package com.gmail.m1512.dan;

import java.util.Scanner;

public class RectangleOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;
		int width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height");
		height = sc.nextInt();
		System.out.println("Input width");
		width = sc.nextInt();
		sc.close();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				if (i == 0 || i == height - 1) {
					System.out.print("*");
				} else if (j == 0 || j == width - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
