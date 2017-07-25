package com.gmail.m1512.dan;

public class OddNumbers {
	public static void main(String[] args) {
		int [] oddN= {0,5,2,4,7,1,3,19};
		int n=0;
		for(int i=0;i<oddN.length;i++) {
			if(oddN[i]%2!=0) {
				n++;
			}
		}
		System.out.println(n+" Odd numbers");
	}
}
