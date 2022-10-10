package org.zoonzis.test;

import java.util.Scanner;

public class Test04 {
		public static void main(String[] args) {
			//04. 성별을 의미하는 정수 값(1,3남자 , 2,4 여자)을 입력받아 남자,여자 출력
			System.out.println("정수 1~4중 하나를 입력하세요.");
			
			
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			if(a==1 || a==3) {
				System.out.println("남자");
				
			}else if (a==2 || a==4) {
				System.out.println("여자");
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			
			
			sc.close();
			
		}
	}
