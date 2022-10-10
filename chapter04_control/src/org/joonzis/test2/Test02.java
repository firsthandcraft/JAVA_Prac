package org.joonzis.test2;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		//입력받은 구구단만 출력
		System.out.println("1~9숫자를 하나 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		
//		for(int i =1; i<=9;i++) {
//			System.out.println(a + " * " + i + " = " + (a*i) );
//		}
		
		
		int i = 1;
		while(i<=9) {
			System.out.println(a + " * " + i + " = " + (a*i) );
			i++;
		}
		
		sc.close();
		
	}
}
