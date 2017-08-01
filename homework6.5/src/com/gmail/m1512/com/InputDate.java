package com.gmail.m1512.com;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class InputDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] date = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of day");
		date[0] = sc.nextInt();
		System.out.println("Input number of month");
		date[1] = sc.nextInt() - 1;
		System.out.println("Input number of year");
		date[2] = sc.nextInt();
		sc.close();
		datenow(date);

	}

	static void datenow(int[] dat) {
		Date date = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		if (dat[2] != cl.get(Calendar.YEAR)) {
			System.out.println(dat[2] + ":");
			if (dat[1] != cl.get(Calendar.MONTH)) {
				System.out.println(dat[1]);
			}
		} else {
			System.out.println("True");
		}
	}

}
