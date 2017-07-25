package com.gmail.m1512.dan;

import java.util.Scanner;

public class Purse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buff;
		String dolar;
		String cent;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your money");
		buff=sc.nextLine();
		sc.close();
		String[] num = buff.split("[,.]");
		for(int i=0;i<num.length;i++) {
			int dc=Integer.parseInt(num[i]);
			for(int j=0;j<10;j++)
			{
				if(dc/1000>=100) {
					if(dc/100000==2) {
						
					}
				}else if(dc/1000>=10) {
					
				}else if(dc/1000<10 && dc/1000!=0) {
					
				}else if(dc%1000>=100) {
					
				}else if(dc%1000>=10) {
					
				}else if(dc%1000<10 && dc/1000!=0) {
					
				}else {
					break;
				}
			}
		}
	}

}
