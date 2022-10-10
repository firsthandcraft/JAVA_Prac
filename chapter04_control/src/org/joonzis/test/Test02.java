package org.joonzis.test;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		//필기와 실기 점수를 입력받아 합격 유무 출력하기
		//합격 기준: 필기와 실기 점수 모두 70점 이상이거나 , 평균이 80이상이 합격 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		System.out.println("필기점수를 입력하세요.");
		int p = sc.nextInt();
		System.out.println("실기점수를 입력하세요.");
		int s = sc.nextInt();
		
		double ps = (p+s)/2.0;
		System.out.println("평균 : " + ps);
		if(p>=70 && s>=70) {
			System.out.println("합격");
		}else if(ps>=80) {
			System.out.println("합격");
			
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
	}
}
