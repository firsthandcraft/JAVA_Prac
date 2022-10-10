package org.joonzis.test;
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		int arr[] = {13,22,-3,92,55,5};
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("2개의 정수를 입력하세요 (0~5)");
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int temp=0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		for(int k=0; k<arr.length;k++) {
			System.out.print(arr[k] + "		");
		}
		
		
		sc.close();
		
	}
}
