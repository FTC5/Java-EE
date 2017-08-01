package com.gmail.m1512.dan;

import java.util.Calendar;
import java.util.Date;

public class NumberOfMilliseconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		int month = cl.get(Calendar.MONTH);
		cl.set(Calendar.MONTH, month - 1);
		Date dat = cl.getTime();
		System.out.println(date.getTime() - dat.getTime());
	}

}
