package com.gmail.m1512.dan;

import java.util.Scanner;
import java.util.Arrays;

public class MirrorMass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input lenght");
		n=sc.nextInt();
		sc.close();
		int [] num=new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length/2;i++) {
			b=num[num.length-1-i];
			num[num.length-i-1]=num[i];
			num[i]=b;
		}
		System.out.println(Arrays.toString(num));
	}

}
