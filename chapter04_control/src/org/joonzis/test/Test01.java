package org.joonzis.test;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// 정수를 입력받아 짝수면 짝수로 홀수면 홀수로 출력 단 3의 배수는 무조건 3의배수로 출력
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요.");
		int a =sc.nextInt();
		
		if(a%2==0 && a%3!=0) {
			System.out.println("짝수");
		}else if(a%3==0) {
			System.out.println("3의 배수");
		}else if(a==0){
			System.out.println("0");
		}else {
			System.out.println("홀수");
		}
		
		sc.close();
	}
	
}
