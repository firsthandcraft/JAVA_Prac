package org.zoonzis.test;
import java.util.Scanner;


public class Test02 {
	public static void main(String[] args) {
		// 나이를 입력받아 성인 또는 미성년자 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		
	
		sc.close();
	}
	
}
