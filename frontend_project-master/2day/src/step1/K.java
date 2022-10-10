package step1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//팩토리얼 함수 만들기 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int n =sc.nextInt();
		int i;
		int fac= 1; //팩토리얼을 누적할 변수 선언시 초기값을 1로 줌
		
		System.out.println("");

		//팩토리얼 함수 만들기 
		//1*2 . 1*2*3. 1*2*3*4...
		
		for(i=1; i<=n; i++) {
			fac*=i;
			System.out.println(n+"!---->>"+fac);		
		}
		

	}

}
