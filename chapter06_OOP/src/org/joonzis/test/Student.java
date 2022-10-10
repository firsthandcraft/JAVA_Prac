package org.joonzis.test;
import java.util.*;
public class Student {

	Scanner sc =new Scanner(System.in);
		String name;
		String dept;
		String score1;
		String score2;
		double average;
		
		boolean isPass;
		
		void input() {
			System.out.println("이름 입력");
			name = sc.nextLine();
			System.out.println("전공 입력");
			dept = sc.nextLine();
			System.out.println("점수1 입력");
			score1 = sc.nextLine();
			System.out.println("점수2 입력");
			score2 = sc.nextLine();
			
			int a=Integer.parseInt(score1);
			int b= Integer.parseInt(score2);
			average = (double)(a+b)/2;
			
			if(average>=80) {
				isPass = true;
			}
			else {
				isPass= false;
			}
			
		}
		
		void output() {
			
			System.out.println("이름 : " + name);
			System.out.println("전공 : " + dept);
			System.out.println("평균 : " + average);
			System.out.println(isPass ? "합격" : "불합격");
			
		}
		
}
