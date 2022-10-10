package org.joonzis.test;
import java.util.*;
public class Test07 {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
		System.out.println(i + "인덱스 값을 입력");
		arr[i] = sc.nextInt();
		}
		
		System.out.println("배열");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + "	");
			}
		System.out.println();
		System.out.println("3의 배수는");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%3==0) {
			System.out.print(arr[i] + "	");
			}
			}
		
		
		sc.close();
	}
}
