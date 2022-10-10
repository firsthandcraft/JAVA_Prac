package org.zoonzis.test;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		//두 정수를 입력받아 a,b에 저장 후 변수의 값을 교환
		System.out.println(" 두 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		System.out.println("a : "+a + " b : "+b);
		System.out.println("변환 후");
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("a : "+a + " b : "+b);
		sc.close();
		
	}
	
	
	
}
