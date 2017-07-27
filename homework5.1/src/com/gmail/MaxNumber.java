package com.gmail;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];
		rand(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		
	}
	static void rand(int []arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100.0);
		}
		
	}
	static int max(int []arr) {
		int max=arr[0];
		for(int i : arr) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}
}
