package org.joonzis.test;

public class Ring {
	
	Circle inner;
	Circle outer;
	
	public Ring() {
	
	}

	public Ring(Circle inner, Circle outer) {
		
		this.inner = inner;
		this.outer = outer;
	}
	
	void output() {
		System.out.println("작은 원");
		inner.output();
		System.out.println("큰 원");
		outer.output();
		
	}
	
	
	
	
	
}
