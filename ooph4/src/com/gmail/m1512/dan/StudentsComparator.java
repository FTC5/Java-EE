package com.gmail.m1512.dan;

import java.util.Comparator;

public class StudentsComparator implements Comparator{
	private int i;
	boolean ascending=true;

	public StudentsComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentsComparator(int i) {
		super();
		this.i = i;
	}
	
	public StudentsComparator(int i, boolean ascending) {
		super();
		this.i = i;
		this.ascending = ascending;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean isAscending() {
		return ascending;
	}

	public void setAscending(boolean ascending) {
		this.ascending = ascending;
	}

	@Override
	public int compare(Object a, Object b) {
		// TODO Auto-generated method stub
		int n;
		if (a != null && b == null) {
			return (this.ascending) ? 1 : -1;
		}
		if (a == null && b != null) {
			return (this.ascending) ? -1 : 1;
		}
		if (a == null && b == null) {
			return 0;
		}
		n=(this.ascending) ? 1 : -1;
		Student studentOne = (Student) a;
		Student studentTwo = (Student) b;
		switch (i) {
		case 0:
			return (studentOne.getName().compareTo(studentTwo.getName())) * n;
		case 1:
			return (studentOne.getSurname().compareTo(studentTwo.getSurname())) * n;
		case 2:
			return (studentOne.getAge() - studentTwo.getAge()) * n;
		case 3:
			return (studentOne.getNameOfCourse().compareTo(studentTwo.getNameOfCourse()))*n; 
		case 4:
			return (studentOne.getCourse() - studentTwo.getCourse()) * n; 
		case 5:
		}
		return 0;
	}


	
}
