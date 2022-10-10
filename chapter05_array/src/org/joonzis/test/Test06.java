package org.joonzis.test;

public class Test06 {
	public static void main(String[] args) {
		int arr[] = {13,22,-3,92,55,5};
		
		int top = arr[0];
		int bot = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(top<arr[i]) {
				top= arr[i];
			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			if(bot>arr[i]) {
				bot= arr[i];
			}
		}
		
		System.out.println("최소 : "+ bot + " 최대 : " +top);
		
	}
}
