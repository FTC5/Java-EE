package com.gmail.m1512.dan;

import java.util.Arrays;

public class ArraysOfRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int [] mas1 = new int[n];
		int [] mas2 = new int [n*2];
		for(int i=0;i<mas1.length;i++) {
			mas1[i]=(int)(Math.random()*100.0);
		}
		System.arraycopy(mas1, 0, mas2, 0,mas1.length);
		for(int i=0;i<mas1.length;i++){
			mas2[i+n]=mas2[i]*2;
		}
		System.out.println(Arrays.toString(mas2));
	}

}
