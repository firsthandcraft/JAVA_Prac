package step1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 반복문
		int i, j,sum=0;
		//전역변수
		System.out.println("1~100까지의 합");
		//1-100까지 합구하기 
		
		//반복문의 단점 : 어디부터 어디까지다라는 조건을 명확히 해야 무한반복이 안된다. 
		//반복문의 단점02 : 반복문에는 조건문을 넣을때  문장이 복잡해지진다.
				
		//지역변수
		for(i=1; i<=100; i++) {
			//sum=i;//100까지 나오고 싶을때
			sum+=i; // 누적의 대입연산자 p.102
			//0=0+1
			//1=1+2
			//3=3+3
			//6=6+4
			//10=10+5 ...
			System.out.println("sum"+sum);
		}
		// 출력하기
//		System.out.println("sum"+sum);
		
		
		/* + 전역 지역 변수 선언없이 대입할때
		 * for문 안에서만 사용가능
		 * for(int i=1; i>=100; i++) {}
		 * 
		 * */
		
			
		//i의 초기값을 1로 하여 2씩 증가하면서 10일때까지 반복해보기
		for(j=1; j<=10; j+=2) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		//i의 초기값을 2로 하여 2씩 증가하면서 10일때까지 반복해보기
		for(j=2; j<=10; j+=2) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		//i의 초기값을 10로 하여 1씩 증가하면서 1보다 크거나 같을때까지 반복	
		for(j=10; j>=1; j--) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		
		
		
	}

}
