package org.joonzis.ex;

public class Ex02_Local {

	
		
		String name;
		int age;
		String sn; //주민등록번호
		boolean isKorean; // 한국인 true 외국인 false
		
		
		
		
		//입력 메소드 2개
		
		void setLocalInfo(String _name, int _age, String _sn) {
			name = _name;
			age = _age;
			sn = _sn;
			isKorean = sn.charAt(7) <='4' ? true :false;
			
		}
		
		void setLocalInfo(String _name, int _age) {
			
			name = _name;
			age = _age;
			isKorean = false;
			
			
		}
		
		//출력 메소드 1개
		//이름, 나이, 주민등록번호 (있으면 그대로 출력, 없으면 없음으로 출력), 한국인 or 외국인
		
		void output() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("주민등록번호 : " + (sn==null ? "없음" :sn));
			System.out.println(isKorean ? "한국인" : "외국인");
			
			
		}
		
		
		
}
