package com.gmail.m1512.dan;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		int num;
		num = cs.nextInt();
		cs.close();
		int n;
		for (int i = 4; i >= 0; i--) {
			n = num;
			n /= Math.pow(10, i);
			System.out.println(n);
			num %= Math.pow(10, i);
		}
	}

}
