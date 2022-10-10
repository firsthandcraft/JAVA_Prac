package org.joonzis.ex;

public class Ex02_PersonMain {
	public static void main(String[] args) {
		Ex02_Person man = new Ex02_Person("김씨", 10, 180, '남');
		man.output();
		
		//Ex02_Person woman = new Ex02_Person();  계발자가 생성자를 하나도 구현하지 않았다면 자바가 디폴트 생성자를 만듬
		//woman.output();    하나라도 만들었다면  Person(){} 형태의 생성자가 없을 때 오류발생
		// 즉 개발자가 생성자를 만들면, 개발자가 원하는 모습으로만 객체를 생성할 수있다.
		
	}
}
