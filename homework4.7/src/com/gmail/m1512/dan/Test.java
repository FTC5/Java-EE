package com.gmail.m1512.dan;

import java.util.Scanner;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		String money;
		int dolar;
		int cent;
		int n=1;
		int buff;
		int []search= {1,2,3,4,5,6,7,8,9,10,11,12,22};
		String []text= {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","twenty"};
		n*=Math.pow(10, 5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your money");
		money=sc.nextLine();
		sc.close();
		String[] num = money.split("[,.]");
		dolar=Integer.parseInt(num[0])+Integer.parseInt(num[1])/100;
		cent=Integer.parseInt(num[1])%100;
		for(int i=0;i<money.length()-1;i++) {
			if(dolar!=0) {
				 buff=dolar/n;
			}else if(cent==0) {
				break;
			}else {
				 buff=cent/n;
			}
			for(int j=0;j<search.length;j++) {
				if(buff==0) {
					break;
				}else if(buff==search[j]) {
					if(i==0 ||i==3) {
						System.out.println(text[j]+" ");
					}else if(cent<20 && i== ){
						System.out.println(text[j]+"ty ");
					}
					
				}else if(buff/10==1 && buff!=12 && buff!=11 && buff%10==search[j]) {
					System.out.println(text[j]+"teen ");
				}else {
					
				}
				
			}
			if(i==0 && buff>0) {
				System.out.println(" hundred ");
			}else if(i==2 && buff>0) {
				System.out.println(" thousand ");
			}else {
				
			}
		}
	}
}
