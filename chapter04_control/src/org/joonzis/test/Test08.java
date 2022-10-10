package org.joonzis.test;
import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
		//권한 출력
		
		System.out.println("1~3의 권한을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		switch(a) {
		case 3:
			System.out.println("실행,쓰기,읽기");
			break;
		case 2:
			System.out.println("쓰기,읽기");
			break;
		case 1:
			System.out.println("읽기");
			break;
		default :
			System.out.println("잘못 입력");
			break;
		
		
		}
		sc.close();
		
	}
}
