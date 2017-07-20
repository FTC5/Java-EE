package com.gmail.m1512.dan;

public class SimpleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=0;
		for (int i = 1; i < 100; i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					a++;
				}
			}
			if(a<=2) {
				System.out.print(i + " , ");
			}
			a=0;
		}
	}

}
