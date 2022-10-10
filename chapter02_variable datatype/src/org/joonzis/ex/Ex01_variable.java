package org.joonzis.ex;

public class Ex01_variable {
	
	
	public static void main(String[] args) {			
    int num1 = 0;
   System.out.println(num1); 
    
		float num2 = 13f;
		System.out.println(num2); 
		
		double num3 = 13.3;
		System.out.println(num3);
		
		char ch = 'c';
		System.out.println(ch);
		
		String str1 = "ww0";
		System.out.println(str1);
		
		int cha ='A';
		System.out.println(cha);
		 
		String str2 ="=====";
		System.out.println(str2);
	
		
		num3 =15.7;
		System.out.println(num3);
		str1 = "hello";
		str2 = "world";
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		//변수의 scope 범위
		// 1) 지역 변수 : 코드블록 안에서만 접근 가능, 벗어나면 소멸
		// 2) 전역 변수 : 모든 지역에서 사용 가능
		int a = 10;
		{
		System.out.println("a의 값은  : "+ a);
		}
		System.out.println("a의 값은  : "+ a);
	}
}
