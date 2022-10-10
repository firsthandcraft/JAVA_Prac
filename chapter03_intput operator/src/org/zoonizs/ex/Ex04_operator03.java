package org.zoonizs.ex;

public class Ex04_operator03 {
	public static void main(String[] args) {
		int a =10 ;
		System.out.println(a==10 && a<100);  //true
		System.out.println(a !=10 || a == 10); // true
		System.out.println(!(a==10)); //false
		

		
		int b = 10;
		//boolean result = (a==100) && (++b >10); // 좋은 코딩은 아님
		//System.out.println("result  : " + result + ", b :" + b); //b=10 이유 &&연산자는 앞의 식이 틀리면 뒤의 것은 실행하지 않는다.
		++b;
		boolean result = (a==100) && (b >10);
		System.out.println("result  : " + result + ", b :" + b);
		
		int age = 18;
		
		boolean isAdult = (age>=20) ? true :false;
		
		int fee = isAdult ? 4000:2000;
		System.out.println("요금  :  " + fee);
		
		String id = "admin";
		// id가 admin이면 인증성공 ,아니면 실패 출력
		
		String isId = (id.equals("admin"))? "인증성공" : "인증실패";
		System.out.println(isId);
		
		
	}
}
