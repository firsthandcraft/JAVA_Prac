package org.joonzis.test;
import java.util.Scanner;
public class Test04 {

	// 점수대로 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = sc.nextInt();
		
		if(a>=97) {
			System.out.println("A+");
		}else if(a>=94) {
			System.out.println("A0");
		}else if(a>=90) {
			System.out.println("A-");
		}else if(a>=87) {
			System.out.println("B+");
		}else if(a>=84) {
			System.out.println("B0");
		}else if(a>=80) {
			System.out.println("B-");
		}else if(a>=77) {
			System.out.println("C+");
		}else if(a>=74) {
			System.out.println("C0");
		}else if(a>=70) {
			System.out.println("C-");
		}else {
			System.out.println("F");
		}
		sc.close();
	
	}
	}
