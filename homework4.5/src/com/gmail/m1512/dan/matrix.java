package com.gmail.m1512.dan;

import java.util.Arrays;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int [][] mas=new int [n][n];
		int buff=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mas[i][j]=j+1;
			}
			System.out.println(Arrays.toString(mas[i]));
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
	         for (int j = i+1; j < n; j++) {
	        	 buff = mas[i][j];
	        	 mas[i][j] = mas[j][i];
	        	 mas[j][i] = buff; 
	         }

	     	System.out.println(Arrays.toString(mas[i]));
	     	}
		System.out.println();
		int num=0;
		int h=1;
		for (int i=n-1;i>0;i--) {
	         for (int j=n-i;j<=i;j++) {
	        	 buff = mas[num][i-h];
	        	 mas[num][i-h] = mas[j][i];
	        	 mas[j][i] = buff;
	        	 h++;
	         }
	         h=1;
	         num++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(mas[i]));
		}
	}
}
