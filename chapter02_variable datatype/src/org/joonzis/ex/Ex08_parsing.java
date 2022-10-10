package org.joonzis.ex;

public class Ex08_parsing {
	public static void main(String[] args) {
		/*
		 * 문자열 변환은 형 변환이 아니고 구문 분석이다.
		 * 
		 *  1. 문자열 -> 정수 (String -> int)
		 *   Integer.parseInt("10") -> 10 -> Integer는 int의 참조 자료형이다.
		 *    (대문자로 시작하는 단어는 ㄴ클래스라고 보면된다.)
		 *    
		 *  2. 문자열 -> 실수  (String -> double)
		 *   Double.parseDouble("3.14") -> 3.14
		 *   
		 *  3. 정수/실수 -> 문자열(int / double -> String)
		 *   String.valueOf(10) -> "10"
		 *   String.valueOf(3.14) -> "3.14"
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		String strAge ="20";
		String strHeight = "165.5";
		int age = Integer.parseInt(strAge);
		// int age2 = Integer.valueOf(strAge);
		double height = Double.parseDouble(strHeight);
		System.out.println(age + height);
		
		
		String s1 = "aaa";
		String s2 = s1;
		String s3 = new String("aaa");
		
		if(s1 ==s2) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
			
			
		}
		if(s2 ==s3) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
			
			
		}
		if(s1.equals(s3)) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
			
			
		}
		
		/*
		 * == 연사나의 경우 객체의 주소값을 비교
		 * .equals() 메소드의 경우 대상의 값 자체를 비교
		 * 
		 * CBV(call by value)
		 * CBR(call by references)
		 * 
		 * 
		 * 
		 */
		
	}
}
