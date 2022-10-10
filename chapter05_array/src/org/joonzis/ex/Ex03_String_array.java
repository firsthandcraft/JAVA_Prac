package org.joonzis.ex;
import java.util.Scanner;
public class Ex03_String_array {
	public static void main(String[] args) {
		/*
		 * 크기 3의 문자열 배열 names 생성후 스캐너로 입력받아 
		 * 입력한 이름  : 00 출력 일반 for문 for each문 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String names[] = new String[3];
		
		for(int i=0; i<names.length;i++) {
			
			System.out.println(i + "번째 이덱스 입력");
			names[i] = sc.nextLine();
			
		}
		
		for(int i=0; i<names.length;i++) {
			
			System.out.println(names[i]);
			
		}
		
		for(String aa : names) {
			System.out.println(aa);
		}
		
		
		sc.close();
		
		
	}
}
