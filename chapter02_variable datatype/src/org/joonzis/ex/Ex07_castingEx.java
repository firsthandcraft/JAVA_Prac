package org.joonzis.ex;

public class Ex07_castingEx {
	public static void main(String[] args) {
		// 1. 줄바꿈
		System.out.println();
		
		// 2. 숫자끼리 + 연산자 : 산술 연산자
		System.out.println(1 + 1);
		System.out.println(1.5 + 1);
		
		// 3. 문자열끼리  + 연산자 : 연결 연산자
		System.out.println("hello" + "java");
		
		// 4. 숫자와 문자열 + 연산자 : 연결 연산자(순서대로 진행)
		System.out.println(100 + "원");       //100원
		System.out.println(100 + 100 + "원"); //200원
		System.out.println("$" + 100);       // $100
		System.out.println("$" + 100 + 100); // $100100
	}
}
