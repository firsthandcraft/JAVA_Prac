package org.zoonzis.test;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		//07. 섭씨 화씨 변환기 화씨 = 섭씨 * 1.8 +32 섭씨 = (화씨 -32) /1.8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨 혹은 화씨를 선택하세요.");
		String temp = sc.nextLine();
		System.out.println("온도를 입력하세요.");
		double a = sc.nextDouble();
		
		if(temp.equals("섭씨")) {
			System.out.println( "화씨로 변환 : "+ (a*1.8 +32));
		}else if(temp.equals("화씨")) {
			System.out.println("섭씨로 변환 : " + ((a-32) /1.8));
		}else {
			System.out.println("잘못 입력했따.");
		}
	
	sc.close();
	}
} 