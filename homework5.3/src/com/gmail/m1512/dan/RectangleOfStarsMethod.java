package com.gmail.m1512.dan;

import java.util.Scanner;

public class RectangleOfStarsMethod {

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
		rectangle(height, width);

	}

	static void rectangle(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (i == 0 || i == h - 1) {
					System.out.print("*");
				} else if (j == 0 || j == w - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
