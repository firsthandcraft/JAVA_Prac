package org.joonzis.test;

public class Student {
	
	String name ,dept;
	Grade grade;
	
	public Student() {
		
	}

	public Student(String name,String d,Grade g) {
		
		this.name = name;
		dept = d;
		grade =g;
		
		
	}
	
	
	void output() {
		
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + grade.getAverage());
		System.out.println("등급 : " + grade.getGrade());
	}
	
	
}
