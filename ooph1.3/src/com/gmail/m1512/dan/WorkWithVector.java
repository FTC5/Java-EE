package com.gmail.m1512.dan;

public class WorkWithVector {
	private double x;
	private double y;
	private double z;
	private double scalarPOV;

	public WorkWithVector() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getScalarPOV() {
		return scalarPOV;
	}

	public String sumaV(Vector3d n1, Vector3d n2) {
		x = n1.getX() + n2.getX();
		y = n1.getY() + n2.getY();
		z = n1.getZ() + n2.getZ();
		return n1.getVectorName() + "+" + n2.getVectorName() + "=" + "(" + x + ";" + y + ";" + z + ");";
	}

	public void scalarProductOfVectors(Vector3d n1, Vector3d n2) {
		scalarPOV = n1.getX() * n2.getX() + n1.getY() * n2.getY() + n1.getZ() * n2.getZ();
	}

	public String vectorProductOfVectors(Vector3d n1, Vector3d n2) {
		x = n1.getY() * n2.getZ() - n1.getZ() * n2.getY();
		y = n1.getZ() * n2.getX() - n1.getX() * n2.getZ();
		z = n1.getX() * n2.getY() - n1.getY() * n2.getX();
		return n1.getVectorName() + "*" + n2.getVectorName() + "=" + "(" + x + ";" + y + ";" + z + ");";
	}

	public Vector3d getVector(String newname) {
		Vector3d A = new Vector3d(newname, x, y, z);
		return A;
	}
}
