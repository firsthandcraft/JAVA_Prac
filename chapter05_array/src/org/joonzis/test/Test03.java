package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
		int arr[] = {10,20,50,60,13,25,97};
		
		int sum =0;
		
		for(int i =0; i<arr.length;i++) {
			
			sum = sum+ arr[i];
		}
		
		System.out.println(sum);
		System.out.println((sum/(double)arr.length));
	}
}
