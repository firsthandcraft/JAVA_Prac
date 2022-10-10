package org.joonzis.ex;

public class Ex04_String {
	public static void main(String[] args) {
		
		String str1 = "Java";
		
		System.out.println(str1.toLowerCase()); // 소문자로 변환
		System.out.println(str1.toUpperCase()); // 대문자로 변환
		System.out.println(str1.indexOf('v'));  // 지정문자의 index 번호 반환
		System.out.println(str1.startsWith("J"));// 지정된 문자열로 시작되는지 (boolean)
		System.out.println(str1.endsWith("a"));// 지정된 문자열로 끝나는지 (boolean)
		System.out.println(str1.contains("J"));// 지정된 문자열을 포함하는지 (boolean)
		System.out.println(str1.substring(1));// 지정된 index 부터 모든 문자열을 반환
		System.out.println(str1.substring(1,3));
		
		String str2 = "    Java    ";
		System.out.println("*" + str2.trim() + "*");  //문자열의 공백 제거
		
		String str3 = "Ja-va";
		String[] s = str3.split("-"); //지정한 문자로 분리하여 배열로 반환
		System.out.println(s.length); 
		if(str1.equals(str2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
//		String str4;
//		System.out.println(str4.isEmpty()); // 사용불가 초기화 필요
//
//		String str5 ="";
//		System.out.println(str5.isEmpty());
//		
//		String str6 = null;
//		System.out.println(str6.isEmpty()); // 실행후, NullPointer 에러 발생
//		
		
		
		
		
		
		
		
		
	}
}
