package org.joonzis.test;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개 입력");
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i + "번째 인덱스 입력");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(arr[1]);
		
		sc.close();
	}
}
