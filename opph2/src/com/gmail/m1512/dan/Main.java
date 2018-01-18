package com.gmail.m1512.dan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square squareOne = new Square(new Point(12, 2), new Point(3, 2));
		Triangle triangleOne = new Triangle(new Point(1, 1), new Point(2, 5), new Point(3, 4));
		Circle circleOne = new Circle(new Point(0, 0), new Point(12, 4));
		Board BoardOne = new Board();
		System.out.println(BoardOne.toString());
		BoardOne.setShape(0, squareOne);
		BoardOne.setShape(1, triangleOne);
		BoardOne.setShape(2, circleOne);
		BoardOne.setShape(3, squareOne);
		BoardOne.setShape(3, triangleOne);
		BoardOne.delShape(3);
		System.out.println(BoardOne.toString());
	}

}
