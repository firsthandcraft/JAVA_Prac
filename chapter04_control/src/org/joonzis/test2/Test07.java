package org.joonzis.test2;
import java.util.*;
public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int a = sc.nextInt();
		
		System.out.println("정수 입력2");
		int b = sc.nextInt();
		
		
		
		
		int sum = 0;
		
		if(a>=b) {
		for(int i =b; i<=a;i++) {
			sum = sum +i;
			
		}
		}else{
			for(int i =a; i<=b;i++) {
				sum = sum +i;
		}
			}
		
		
		System.out.println(sum);
	sc.close();
	
	
}
}