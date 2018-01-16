package com.gmail.m1523.dan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myNewCAt = new Cat(12, "dark", "Igor", 6);
		System.out.println(myNewCAt.toString());
		myNewCAt.meow();
		Cat myNewCAt2 = new Cat(3, "white", "Alice", 1);
		System.out.println(myNewCAt2.toString());
		myNewCAt2.meow();
		Cat myNewCAt3 = new Cat(7, "white-dark", "Golder", 6);
		System.out.println(myNewCAt3.toString());
		myNewCAt3.meow();
	}

}
