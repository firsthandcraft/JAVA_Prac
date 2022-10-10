package org.joonzis.ex;
import java.util.*;
public class Ex01_primitive_array {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		for(int i =0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");		
	} 
		
		int arr1[] = new int[3];
		int arr2[] = {10,20,30};
		// 배열 내의 전체 데이터 확인
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr2[2]);
		
		}
	
	
	}




