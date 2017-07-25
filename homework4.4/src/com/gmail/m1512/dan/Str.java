package com.gmail.m1512.dan;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text;
        int num=0;
        char b='b';
		Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        text = sc.nextLine();
        sc.close();
        for(int i=0;i<text.length();i++) {
        	if(b==text.charAt(i)) {
        		num++;
        	}
        }
        System.out.println("The number of characters 'b' ="+num);
	}

}
