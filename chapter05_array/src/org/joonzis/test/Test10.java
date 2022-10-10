package org.joonzis.test;
import java.util.*;
public class Test10 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int k[] = new int[5];
		
			for(int i=0; i<k.length; i++) {
			
				System.out.println(i + "번쨰 숫자 입력");
				k[i] = sc.nextInt();
			}
		
		int arr[][] = new int[5][];	
		
			for(int i=0; i<5;i++) {
				arr[i] = new int[k[i]];
		
				}
		
			for(int i=0; i<arr.length;i++) {
				for(int j = 0; j<arr[i].length;j++) {
				
					arr[i][j] = 1;
					System.out.print(arr[i][j] + "\t");
				
					}
					System.out.println();
				}
	sc.close();
	}
	
}
