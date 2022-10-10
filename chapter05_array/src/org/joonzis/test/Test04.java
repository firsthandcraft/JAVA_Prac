package org.joonzis.test;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(i + "정수입력");
			arr[i] = sc.nextInt();
			
		}
		
		int sum = 0;
for(int i=0;i<arr.length;i++) {
			
			sum = sum +arr[i];
			
		}
		
		
	System.out.println("총점 : "+ sum);
	
	sc.close();
	}
}
