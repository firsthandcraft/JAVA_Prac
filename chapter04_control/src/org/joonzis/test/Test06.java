package org.joonzis.test;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		// 알파벳을 하나 입력받아 대문자면 소문자로 소문자면 대문자로 출력 나머지는 그냥 출력
		System.out.println("문자를 입력하세요");
		
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		
		int a = ch;
		
		if(a>=97 && a<=122) {
			ch = Character.toUpperCase(ch);


			System.out.println(ch);
		}else if(a>=65 && a<=90) {
			ch = Character.toLowerCase(ch);
			System.out.println(ch);
		}else {
			System.out.println(ch);
		}
		
		sc.close();
		
		
	}
}
