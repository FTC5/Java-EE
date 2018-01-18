package com.gmail.m1512.dan;

public class Point {
	private double x;
	private double y;

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistanceBetPoints(Point nextP) {
		return Math.sqrt(Math.pow((nextP.getX() - x), 2) + Math.pow((nextP.getY() - y), 2));
	}
}
