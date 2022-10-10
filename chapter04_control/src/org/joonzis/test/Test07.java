package org.joonzis.test;
import java.util.Scanner;
public class Test07 {

	public static void main(String[] args) {
		// 섭씨 화씨 변환기 스위치문
		
		System.out.println("섭씨 혹은 화씨를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		String temp = sc.nextLine();
		System.out.println("온도를 입력하세요");
		
		double t = sc.nextDouble();
		
		switch (temp) {
		case "섭씨":
			System.out.println("화씨 : " + (t*1.8 +32));
			break;
		case "화씨":
			System.out.println("섭씨 : " + ((t-32) /1.8));
			break;
		default  :
			System.out.println("잘못입력하셨습니다.");
			break;
			
		}
		
		sc.close();
		
	}
}
