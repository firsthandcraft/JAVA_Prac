package org.zoonzis.test;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		//08. 체질량 지수 = 몸무게 / (키의 제곱) 25이상면 과체중 20 이상 정상 20 미만 저체중
		System.out.println("몸무게를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		System.out.println("키를 입력하세요. M로 입력");
		double h = sc.nextDouble();
		
	   double bmi= w/(h*h);
	   
	   if(bmi>=25) {
		   System.out.println("과체중");
	   }else if(bmi >=20 && bmi <25) {
		   
		   System.out.println("정상");
		   
	   }else if(bmi<20) {
		   System.out.println("저체중");
	   }
	System.out.println(bmi);
	sc.close();
	
	
	
	
	
	
	
	
	
	
	
	}
}
