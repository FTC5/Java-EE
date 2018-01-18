package com.gmail.m1512.dan;

public class Triangle extends Shape {
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	private double sideOne;
	private double sideTwo;
	private double sideThree;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
		getSide();
	}

	private void getSide() {
		sideOne = pointOne.getDistanceBetPoints(pointTwo);
		sideTwo = pointOne.getDistanceBetPoints(pointThree);
		sideThree = pointThree.getDistanceBetPoints(pointTwo);
	}

	@Override
	public double getPerimetr() {
		if (test()) {
			return sideOne + sideThree + sideTwo;
		} else {
			return -1.0;
		}

	}

	@Override
	public double getArea() {
		if (test()) {
			double p;
			p = (sideOne + sideThree + sideTwo) / 2.0;
			return Math.sqrt(p * (p - sideOne) * (p - sideThree) * (p - sideTwo));
		} else {
			return -1.0;
		}
	}

	private boolean test() {
		if (sideOne + sideTwo > sideThree && sideThree + sideTwo > sideOne && sideThree + sideOne > sideTwo) {
			return true;
		} else {
			System.out.println("Error");
			return false;
		}
	}
}
