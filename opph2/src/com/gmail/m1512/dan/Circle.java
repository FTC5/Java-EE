package com.gmail.m1512.dan;

public class Circle extends Shape {
	private Point pointA;
	private Point center;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(Point pointA, Point center) {
		super();
		this.pointA = pointA;
		this.center = center;
	}

	@Override
	public double getPerimetr() {
		return pointA.getDistanceBetPoints(center) * Math.PI * 2.0;
	}

	@Override
	public double getArea() {
		return Math.pow(pointA.getDistanceBetPoints(center), 2) * Math.PI;
	}
}
