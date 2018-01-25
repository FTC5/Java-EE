package com.gmail.m1512.dan;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Group implements Voenkom {
	private Student[] students = new Student[10];
	private int numberOfStudents = 0;

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interectivSetStudents() throws MyException {
		Student student = new Student();
		try {
			student.setName(this.getName());
			student.setSurname(this.getSurname());
			student.setAge(this.getAge());
			student.setNameOfCourse(this.getNameOfCourse());
			student.setCourse(this.getCourse());
			setStudents(student);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	private String getName() throws NullPointerException {
		boolean result = false;
		String name="";
		while (!result) {
			try {
				name = JOptionPane.showInputDialog("Input name of student");
				result = true;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return name;
	}

	private String getSurname() throws NullPointerException {
		boolean result = false;
		String surname="";
		while (!result) {
			try {
				surname = JOptionPane.showInputDialog("Input surname of student");
				result = true;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return surname;
	}

	private int getAge() throws NullPointerException {
		boolean result = false;
		int age = 0;
		while (!result) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog("Input age of student"));
				result = true;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return age;
	}

	private String getNameOfCourse() throws NullPointerException {
		boolean result = false;
		String nameOfCourse = "";
		while (!result) {
			try {
				nameOfCourse = JOptionPane.showInputDialog("Input name of course");
				result = true;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return nameOfCourse;
	}

	private int getCourse() throws NullPointerException {
		boolean result = false;
		int course = 0;
		while (!result) {
			try {
				course = Integer.valueOf(JOptionPane.showInputDialog("Input number of course"));
				result = true;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return course;
	}

	public void setStudents(Student student) throws MyException {
		if (student != null) {
			if (numberOfStudents >= students.length) {
				throw new MyException();
			}
			students[numberOfStudents] = student;
			numberOfStudents += 1;
		} else {
			System.out.println("Student is empty");
		}
	}

	public Student searchStudent(String surname) {
		Student A = new Student();
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].getSurname() == surname) {
				A = students[i];
				return A;
			}
		}
		return A;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void delStudent(String surname) {
		boolean a = false;
		for (int i = 0; i < numberOfStudents; i++) {
			if (surname.compareTo(students[i].getSurname())==0 || a == true) {
				a = true;
				if (i < numberOfStudents - 1) {
					students[i] = students[i + 1];
				} else {
					students[i] = null;
					numberOfStudents -= 1;
				}
			}
		}

	}

	@Override
	public String toString() {
		sort();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < students.length; i++) {
			str.append(i + 1 + ") ");
			str.append(students[i]);
			str.append(System.lineSeparator());
		}
		return str.toString() + "\n";
	}

	private void sort() {
		Student buff;
		for (int i = 0; i < numberOfStudents; i++) {
			for (int j = 0; j < numberOfStudents; j++) {
				if (compareStudentSort(students[i], students[j]) < 0) {
					buff = students[i];
					students[i] = students[j];
					students[j] = buff;
				}
			}
		}
	}

	public int compareStudentSort(Student a, Student b) {
		// TODO Auto-generated method stub4
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getSurname().compareTo(b.getSurname());
	}

	@Override
	public Student[] getRookies() {
		// TODO Auto-generated method stub
		int n = 0;
		for (Student student : students) {
			if (student != null && student.getAge() >= 18) {
				n++;
			}
		}
		Student[] rookies = new Student[n];
		n = 0;
		for (Student student : students) {
			if (student != null && student.getAge() >= 18) {
				rookies[n] = student;
				n++;
			}
		}
		return rookies;
	}
	public void sortByParametr(int i) {
		Arrays.sort(this.students, new StudentsComparator(i));
	}
	public void sortByParametr(int i,boolean ascendin) {
		Arrays.sort(this.students, new StudentsComparator(i,ascendin));
	}

}
