package com.gmail.m1512.dan;

import java.util.Formatter;

public class NumberPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 11; i++) {
			Formatter form = new Formatter();
			form.format("%." + i + "f", Math.PI);
			System.out.println(i-1+")"+form.toString());
			form.close();
		}
	}

}
