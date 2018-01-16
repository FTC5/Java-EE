package com.gmail.m1512.dan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector3d vector1 = new Vector3d("v1", 12, 2, 3);
		System.out.println(vector1.toString());
		Vector3d vector2 = new Vector3d("v2", 3, -4, 1);
		System.out.println(vector2.toString());
		WorkWithVector work1 = new WorkWithVector();
		System.out.println(work1.sumaV(vector1, vector2));
		Vector3d vector3 = new Vector3d();
		vector3 = work1.getVector("v3");
		System.out.println(vector3.toString());
		work1.scalarProductOfVectors(vector1, vector3);
		System.out.println(work1.getScalarPOV());
		System.out.println(work1.vectorProductOfVectors(vector3, vector2));
	}

}
