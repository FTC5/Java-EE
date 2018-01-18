package com.gmail.m1512.dan;

public class Board {
	private Shape[] segment = new Shape[4];

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setShape(int i, Shape newShape) {
		if (segment[i] == null) {
			segment[i] = newShape;
		} else {
			System.out.println("Part of the board is full");
		}
	}

	public void delShape(int i) {
		if (segment[i] != null) {
			segment[i] = null;
		} else {
			System.out.println("Part of the board is empty");
		}
	}

	@Override
	public String toString() {
		String info = "";
		for (int i = 0; i < segment.length; i++) {
			if (segment[i] != null) {
				info += "\n Board segment " + i + " :" + "\n" + segment[i].getClass().getSimpleName() + "\n Perimetr :"
						+ segment[i].getPerimetr() + "\n Area :" + segment[i].getArea() + "\n";
			} else {
				continue;
			}
		}
		return info;
	}

}
