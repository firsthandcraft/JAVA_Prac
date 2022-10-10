package org.joonzis.ex;
import java.util.*;
public class TestOper {
	
	// 필드 double val1, val2
	
	//메소드 void plus(double,double)
	//void minus() void multi() double div()
	//main 클래스에서 2개의 값을 이용하여 각가의 값 출력
	Scanner sc = new Scanner(System.in);
	double val1;
	double val2;
	
	
	void plus(int a,int b) {
		int sum = a+b;
		System.out.println("더하기" + sum);
	}
	
	void minus() {
		System.out.println("숫자입력");
		val1 = sc.nextDouble();
		System.out.println("숫자입력");
		val2 = sc.nextDouble();
		System.out.println("빼기 : " + (val1-val2));
		
	}
	void multi() {
		System.out.println("숫자입력");
		val1 = sc.nextDouble();
		System.out.println("숫자입력");
		val2 = sc.nextDouble();
		System.out.println("곱하기 : " + (val1*val2));
		
	}
	double div() {
		System.out.println("숫자입력");
		val1 = sc.nextDouble();
		System.out.println("숫자입력");
		val2 = sc.nextDouble();
		return val1/val2;
		
	}
	
	
}
