package com.gmail.m1512.dan;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leng;
		leng=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input length of the array");
		leng=sc.nextInt();
		int [] mas =new int[leng];
		for(int i=0;i<=leng;i++) {
			if(i==leng) {
				System.out.print(Arrays.toString(mas));
			}else {
				System.out.println(i+1+")");
				mas[i]=sc.nextInt();
			}
		}
		sc.close();
	}

}
