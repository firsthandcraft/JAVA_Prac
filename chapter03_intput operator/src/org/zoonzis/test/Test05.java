package org.zoonzis.test;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		// 국어 영어 수학 점수를 입력받아 평균 출력하기 90이상이면 A 80 이상이면 B 70 이상이면 C 60 이상이면 D 이하는 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int c = sc.nextInt();
		
		double d = (a+b+c)/3.0;
		
		if(d>=90) {
			System.out.println("평균점수 : " + d + " 등급 : A" );
		}else if(d>=80 && d<90) {
			System.out.println("평균점수 : " + d + " 등급 : B" );
		}else if(d>=70 && d<80) {
			System.out.println("평균점수 : " + d + " 등급 : C" );
		}else if(d>=60 && d<70) {
			System.out.println("평균점수 : " + d + " 등급 : D" );
		}else  {
			System.out.println("평균점수 : " + d + " 등급 : F" );
		}
		
		sc.close();
		
	}
}
