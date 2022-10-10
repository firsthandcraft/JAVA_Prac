package org.joonzis.test;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//문자를 입력받아 대소문자 아리비아 숫자 일반 문자 구분해서 출력
		System.out.println("문자를 하나 입력하세요");
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		
		int a = ch;
		System.out.println(a);
		
		if(a>=65 && a<=90) {
			System.out.println("대문자");
		}else if(a>=97 && a<=122) {
			System.out.println("소문자");
		}else if(a>=48 && a<=57) {
			System.out.println("아라비아숫자");
		}else {
			System.out.println("일반");
		}
		sc.close();
		
	}
}
