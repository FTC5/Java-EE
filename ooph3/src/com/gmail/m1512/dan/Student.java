package com.gmail.m1512.dan;

public class Student extends Human {
	private String nameOfCourse;
	int course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String surname, String name, int age, String nameOfCourse, int course) {
		super(name, surname, age);
		this.nameOfCourse = nameOfCourse;
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	public String getNameOfCourse() {
		return nameOfCourse;
	}

	public void setNameOfCourse(String nameOfCourse) {
		this.nameOfCourse = nameOfCourse;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [surname=" + getSurname() + ", name=" + getName() + ", age=" + getAge() + "name of course="
				+ nameOfCourse + ", course=" + course + "]";
	}

}
