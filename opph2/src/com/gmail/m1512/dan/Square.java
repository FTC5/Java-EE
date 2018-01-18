package com.gmail.m1512.dan;

public class Square extends Shape {
	private Point pointOne;
	private Point pointTwo;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(Point pointOne, Point pointTwo) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
	}

	@Override
	public double getPerimetr() {
		return pointOne.getDistanceBetPoints(pointTwo) * 4.0;
	}

	@Override
	public double getArea() {
		return pointOne.getDistanceBetPoints(pointTwo) * pointOne.getDistanceBetPoints(pointTwo);
	}

}
