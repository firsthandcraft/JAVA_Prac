package org.zoonizs.ex;

public class Ex02_operator01 {
	public static void main(String[] args) {
		/*
		 * 1. 산술연산자 
		 *      정수 	  실수
		 *   +  덧셈   덧셈 
		 *   -  뺄셈   뺄셈
		 *   *  곱셉   곱셈
		 *   /  몫    나누기
		 *   %  나머지  XX
		 */
		
		/*
		 * 2. 대입연산자
		 * 
		 *  =  : 대입
		 *  += : 더해서 대입
		 *  -= : 빼서 대입
		 *  *= : 곱해서 대입
		 *  /= : 몫으로 대입(정수), 나눠서 대입(실수)
		 *  %= : 나머지를 구해서 대입
		 *
		 */
		// 카프리카 수를 구하기 위해 2자리 정수를 앞뒤로 분리, 4자리 정수를 앞뒤로 분리
		// 어떤 수의 제곱수를 두 부분으로 나누어 더했을 때, 다시 원래의 수가 되는 수
		// 앞뒤로 분리해서 (앞+뒤)*(앞+뒤) == 자신
		// ex. 81 : (8+1)*(8+1) == 81
		// ex. 3025 : (30+25)*(30+25) = 3025
		
		
		int a = 81;
		
		int b =  a/10;
		int c =  a%10;
		
		System.out.println((b+c)*(b+c));

		int aa = 3025;
		int bb = aa/100;
		int cc = aa%100;
		
		System.out.println((bb+cc) *(bb+cc));
		
		
		
		
		
	}
}
