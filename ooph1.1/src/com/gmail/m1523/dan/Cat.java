package com.gmail.m1523.dan;

public class Cat {
	private String name;
	private int year;
	private String color;
	private int weight;
	private String catSay;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(int year, String color, String name, int weight) {
		super();
		this.year = year;
		this.color = color;
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat:" + "\n" + "name=" + name + "\n" + "Year=" + year + "\n" + "Color=" + color + "\n" + "Weight="
				+ weight;
	}

	public String getCatSay() {
		return catSay;
	}

	public void setCatSay(String catSay) {
		this.catSay = catSay;
	}

	public void meow() {

		if (year < 5) {
			setCatSay("Meow!");
		} else if (year < 9) {
			setCatSay("Miaou!!");
		} else {
			setCatSay("Mew!!!");
		}
		System.out.println("My cat say to me:" + "\n" + getCatSay() + "\n");
	}

}
