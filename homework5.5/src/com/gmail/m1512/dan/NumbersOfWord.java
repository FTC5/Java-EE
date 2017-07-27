package com.gmail.m1512.dan;

import java.util.Scanner;

public class NumbersOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input text");
		text=sc.nextLine();
		sc.close();
		System.out.println(words(text)+" words in the line");
	}
	
	static int words(String text) {
		String[] t = text.split("[,.?!;: ]");
		return t.length;
	}

}
