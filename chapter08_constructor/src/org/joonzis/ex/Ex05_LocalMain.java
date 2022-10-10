package org.joonzis.ex;

public class Ex05_LocalMain {
	public static void main(String[] args) {
		Ex05_Local lc = new Ex05_Local();
		Ex05_Local lc1 = new Ex05_Local("배현우", 27);
		Ex05_Local lc2 = new Ex05_Local("박소영", 27, "970119-2255233");

		lc.output();
		lc1.output();
		lc2.output();
	}
}
