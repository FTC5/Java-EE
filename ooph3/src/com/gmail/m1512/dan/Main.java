package com.gmail.m1512.dan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group groupOne = new Group();
		Student student1 = new Student("Mevsha", "Sergei", 18, "bookkeeping", 3);
		Student student2 = new Student("Aksenova", "Diana", 18, "bookkeeping", 3);
		Student student3 = new Student("Lupanov", "Roman", 18, "bookkeeping", 3);
		Student student4 = new Student("Sahapov", "Evgeny", 18, "bookkeeping", 3);
		Student student5 = new Student("Sharonova", "Irina", 18, "bookkeeping", 3);
		Student student6 = new Student("Markov", "Sergei", 18, "bookkeeping", 3);
		Student student7 = new Student("Denisov", "Zhenya", 18, "bookkeeping", 3);
		Student student8 = new Student("Afanasyeva", "Ekaterina", 18, "bookkeeping", 3);
		Student student9 = new Student("Kuznetsova", "Karina", 18, "bookkeeping", 3);
		Student student10 = new Student("Antonova", "Marina", 18, "bookkeeping", 3);
		Student student11 = new Student("Vyal'din", "Mikhail", 18, "bookkeeping", 3);
		try {
			groupOne.setStudents(student1);
			groupOne.setStudents(student2);
			groupOne.setStudents(student3);
			groupOne.setStudents(student4);
			groupOne.setStudents(student5);
			groupOne.setStudents(student6);
			groupOne.setStudents(student7);
			groupOne.setStudents(student8);
			groupOne.setStudents(student9);
			groupOne.setStudents(student10);
			groupOne.setStudents(student11);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		Student A = new Student();
		A = groupOne.searchStudent("Lupanov");
		System.out.println(A.getSurname() + " " + A.getName());
		System.out.println(groupOne.toString());
		groupOne.delStudent("Vyal'din");
		groupOne.delStudent("Lupanov");
		System.out.println(groupOne.toString());
	}

}
