package com.gmail.m1512.dan;

public class Triangle {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	private boolean test = false;
	private double S;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int sideOne, int sideTwo, int sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
		test();
	}

	public void test() {
		if (sideOne + sideTwo > sideThree && sideThree + sideTwo > sideOne && sideThree + sideOne > sideTwo) {
			test = true;
		}
	}

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}

	public void areaOfTriangle() {
		if (test == true) {
			double p;
			p = (sideOne + sideThree + sideTwo) / 2;
			S = Math.sqrt(p * (p - sideOne) * (p - sideThree) * (p - sideTwo));
			System.out.println("Area of a triangle=" + S);
		} else {
			System.out.println("ERROR");
		}
	}
}
