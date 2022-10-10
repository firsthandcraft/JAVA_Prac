package org.joonzis.ex;
import java.util.Scanner;
public class Ex04_2D_array {
	public static void main(String[] args) {
		
		
		// 2행 3열 int 배열
		
		int arr[][] = {
				   		{10,20,30},
					    {40,50,60}
							};
		
		// 
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
