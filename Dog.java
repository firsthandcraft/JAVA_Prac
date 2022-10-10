package org.joonzis.test;

public class Dog {

	String name, breed;
	int age;

	void setDog(String _name, int _age) { // 품종은 푸들
		name = _name;
		age = _age;
		breed = "푸들";

	}

	void setDog(String _name, int _age, String _breed) {
		name = _name;
		age = _age;
		breed = _breed;

	}

	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("품종 : " + breed);

	}
	// System.out.println("주민등록번호 : " + (sn==null ? "없음" :sn));

}
