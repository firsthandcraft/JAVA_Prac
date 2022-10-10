package org.joonzis.ex;





class Person{
	char gender;
	int age;
	double height;
	String name;
	
	
	void info() {
		
		
		
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성명 : " + name);
	
}}

public class Ex03_PersonMain {
	public static void main(String[] args) {
			
		Person woman = new Person();
		Person man = new Person();
		
		woman.gender ='여';
		woman.age = 80;
		woman.height = 150.3;
		woman.name = "박소영";
		woman.info();
		System.out.println("------");
		
		man.gender ='남';
		man.age = 27;
		man.height = 182.3;
		man.name = "배현우";
		
		man.info();
		
	}
}
