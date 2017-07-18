package com.gmail.m1512.dan;

import java.util.Scanner;

public class HappyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ticket;
		int l;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of ticket");
		ticket = sc.nextInt();
		sc.close();
		l = ticket / 1000 + (ticket / 100 % 10);
		r = ticket % 10 + (ticket % 100 / 10);
		if (l == r) {
			System.out.println("Happy ticket!! :)");
		} else {
			System.out.println("Normal ticket :|");
		}
	}

}
