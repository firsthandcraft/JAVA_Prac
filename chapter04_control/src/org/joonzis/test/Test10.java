package org.joonzis.test;
import java.util.Scanner;
public class Test10 {

	// 점수대로 출력 스위치문으로
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = sc.nextInt();
		String aa ="";
		if(a>=97) {
			aa= "A+";
		}else if(a>=94) {
			aa= "A0";
		}else if(a>=90) {
			aa= "A-";
		}else if(a>=87) {
			aa= "B+";
		}else if(a>=84) {
			aa= "B0";
		}else if(a>=80) {
			aa= "B-";
		}else if(a>=77) {
			aa= "C+";
		}else if(a>=74) {
			aa= "C0";
		}else if(a>=70) {
			aa= "C-";
		}else {
			aa= "F";
		}
		sc.close();
		
		switch(aa) {
		case "A+":
			System.out.println("A+");
			break;
		case "A0":
			System.out.println("A0");
			break;
		case "A-":
			System.out.println("A-");
			break;
		case "B+":
			System.out.println("B+");
			break;
		case "B0":
			System.out.println("B0");
			break;
		case "B-":
			System.out.println("B-");
			break;
		case "C+":
			System.out.println("C+");
			break;
		case "C0":
			System.out.println("C0");
			break;
		case "C-":
			System.out.println("C-");
			break;
			default : 
				System.out.println("F");
			
		}
		
	
	}
	}