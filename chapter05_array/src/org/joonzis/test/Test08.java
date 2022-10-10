package org.joonzis.test;
import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		int scores[] = new int[5];
		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<names.length;i++) { // 초기화여서 원래는 입력없이 임의의 값을 미리 집어넣으면 되긴하지만 그냥해보왔따!
			System.out.println(i + " 번째 이름");
			names[i] = sc.nextLine();
		}
		
		System.out.println("점수를 입력하세요");
		for(int i=0; i<scores.length;i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		for(int i=0; i<scores.length;i++) {
			System.out.print(scores[i] + "	");
			
		}
		System.out.println();
		int top = scores[0];
		int bot = scores[0];
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			sum = sum + scores[i];
			
		}
		for(int i=0; i<scores.length;i++) {
			if(top<scores[i]) {
				top = scores[i];
			}
			
		}
		for(int i=0; i<scores.length;i++) {
			if(bot>scores[i]) {
				bot = scores[i];
			}
			
		}
		
		System.out.println("최대 : " + top + " 최소 : " + bot + " 평균 : " + sum/(double)scores.length);
		
		sc.close();
		
	}
}
