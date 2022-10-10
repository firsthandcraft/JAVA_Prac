package org.joonzis.test2;
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int a = sc.nextInt();
		while(true) {
			if(a<=1) {
			 a = sc.nextInt();
			}else {
				break;
			}
		}
		int sum = 0;
		for(int i =1; i<=a;i++) {
			sum = sum +i;
			
		}
		System.out.println(sum);
	sc.close();
	}
	
}
