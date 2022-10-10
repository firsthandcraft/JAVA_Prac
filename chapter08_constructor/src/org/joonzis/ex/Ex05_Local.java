package org.joonzis.ex;

public class Ex05_Local {

	String name;
	int age;
	String sn;
	boolean isKorean;

	public Ex05_Local() {

	}

	public Ex05_Local(String n, int a, String s) {
		name = n;
		age = a;
		sn = s;
		isKorean = sn.charAt(7) <= '4' ? true : false;
	}

	public Ex05_Local(String n, int a) {
		name = n;
		age = a;

	}

	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + (sn == null ? "없음" : sn));
		System.out.println(isKorean ? "한국인" : "외국인");

	}
}
