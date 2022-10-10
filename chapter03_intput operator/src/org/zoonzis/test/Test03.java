package org.zoonzis.test;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		// 매출액과 등급을 입력받아 등급이 vip면 20% 할인 일반이면 5%할인하는 프로그램 구현
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등급을 입력하세요.(vip or 일반)");
		String b = sc.nextLine();
		
		System.out.println("매출액을 입력하세요.");
		int a = sc.nextInt();
		
		if(b.equalsIgnoreCase("vip")) {
			System.out.println("할인된 급액 : " + (int)(a*0.8) +   " 등급 : " + b + " 할인율 20%");
		}else if(b.equalsIgnoreCase("일반")){
			System.out.println("할인된 급액 : " + (int)(a*0.95) +   " 등급 : " + b + " 할인율 5%");
		}else {
			System.out.println("R");
		}
		
		sc.close();
	}
	
}
