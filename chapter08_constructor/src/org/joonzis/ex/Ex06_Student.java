package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_Student {
	Scanner sc = new Scanner(System.in);
	String name;
	String dept;
	String score1;
	String score2;
	double avg;

	boolean isPass;
	public Ex06_Student() {}
	public Ex06_Student(String n, String d) {

		name = n;
		dept = d;

	}

	void input() {

		System.out.println("점수1 입력");
		score1 = sc.nextLine();
		System.out.println("점수2 입력");
		score2 = sc.nextLine();

		int a = Integer.parseInt(score1);
		int b = Integer.parseInt(score2);
		avg = (a + b) / 2.0;

		if (avg >= 80) {
			isPass = true;
		} else {
			isPass = false;
		}

	}

	void output() {

		System.out.println("이름 : " + name);
		System.out.println("전공 : " + dept);
		System.out.println("평균 : " + avg);
		System.out.println(isPass ? "합격" : "불합격");

	}
}
