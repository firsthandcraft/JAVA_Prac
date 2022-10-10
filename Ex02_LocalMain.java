package org.joonzis.ex;

public class Ex02_LocalMain {
	public static void main(String[] args) {
		Ex02_Local person1 = new Ex02_Local();
		
		person1.setLocalInfo("김씨", 50);
		person1.output();
		
		
		
		//-----
		
		Ex02_Local person2 = new Ex02_Local();
		
		person2.setLocalInfo("카말", 45, "777777-7987777");
		person2.output();
		
	}
}
