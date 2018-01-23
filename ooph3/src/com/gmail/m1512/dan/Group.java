package com.gmail.m1512.dan;

public class Group {
	private Student[] students = new Student[10];
	private int numberOfStudents = 0;

	public Group() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void delStudent(String surname) {
		boolean a = false;
		for (int i = 0; i < numberOfStudents; i++) {
			if (surname == students[i].getSurname() || a == true) {
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
				if (students[i].getSurname().compareTo(students[j].getSurname()) < 0) {
					buff = students[i];
					students[i] = students[j];
					students[j] = buff;
				}
			}
		}
	}

}
