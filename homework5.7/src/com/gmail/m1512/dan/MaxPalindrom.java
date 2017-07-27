package com.gmail.m1512.dan;

public class MaxPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		max=palindrom();
		System.out.println(max);
	}
	static int palindrom() {
		int num=0;
		for(int i=999;i>900;i--) {
			for(int j=999;j>900;j--) {
				num=i*j;
				if(test(num)==1) {
				return num;
				}
				
			}
		}
		return 0;
	}
	static int test(int num) {
		int a;
		int b;
		int c;
		a = num % 10;
		b = num % 100 / 10;
		c = num % 1000 / 100;
		if (a != num / 100000) {
			return 0;
		} else if (b != num / 10000 % 10) {
			return 0;
		} else if (c != num / 1000 % 10) {
			return 0;
		} else {
			return 1;
		}
	}
}
