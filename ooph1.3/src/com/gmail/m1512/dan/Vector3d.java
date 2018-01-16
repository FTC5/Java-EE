package com.gmail.m1512.dan;

public class Vector3d {
	private String vectorName;
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vector3d(String vectorName, double x, double y, double z) {
		super();
		this.vectorName = vectorName;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getVectorName() {
		return vectorName;
	}

	public void setVectorName(String vectorName) {
		this.vectorName = vectorName;
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return vectorName + "(x=" + x + ",y=" + y + ",z=" + z + ")";
	}

}
