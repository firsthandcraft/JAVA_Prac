package org.joonzis.test;

public class StudentGradeMain {
	public static void main(String[] args) {
		
//		Grade g = new Grade(1,1,1);
//		Student st = new Student("배현우","컴공",g);
		Student st = new Student("배현우","컴공",new Grade(100,100,100));
		
		st.output();
		
	}
}
