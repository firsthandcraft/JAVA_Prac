package org.zoonizs.ex;

import java.util.*;

public class Ex01_input {
	public static void main(String[] args) {
		/*
		 *  1. Scanner 클래스
		 * 
		 *  1) console창을 통한 입력
		 *  
		 *  2) java.util.Scanner 클래스로 조재
		 *   	(1) java.util.Scanner 로 사용
		 *   	(2) import 후 사용
		 *   		import 대상 : java.lang 이외의 모든 클래스
		 *   
		 *   
		 *  3) Scanner 클래스의 객체 생성 방범
		 *  	Scanner 객체명 = new Scanner(입력스트림);
		 *  
		 *  4) ........
		 */
		
		// 1. Scanner 객체 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 >>");
		String name = sc.nextLine();
		
		
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();
		
		System.out.println("키 입력 >>");
		double height = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		sc.close();
		
	}
}
