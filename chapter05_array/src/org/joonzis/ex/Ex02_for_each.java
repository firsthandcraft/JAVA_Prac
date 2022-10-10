package org.joonzis.ex;
import java.util.Scanner;
public class Ex02_for_each {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(i + "번째 인덱스 입력!");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
		
		System.out.println();
		for(int num : arr) {     // for each문 이거 좋다!!!!! 단! 인덱스값을 넣을수가 없어요 걍 포문쓰셈
			System.out.println(num);
		}
		
//		int arr2[] = new int[3];
//		
//		for(int num : arr2) {
//			System.out.println("입력하세요");
//			num = sc.nextInt();
//			
//		}
//		
//		for(int num : arr2) {
//			
//			System.out.println(num); // 0 0 0 나온다!!!
//			
//			
//		}
		
		
		
		
		
		
		sc.close();
	
	}
}
