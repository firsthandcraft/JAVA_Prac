package org.joonzis.ex;

public class Ex03_Circle {
	/*
	 *  필드 int x y
	 *  double radius
	 *  
	 *  메소드 
	 *   기본 생성자
	 *   r입력받는 생성자
	 *   각 좌표 밑 r값을 받는 생성자
	 *   calcArea 원의 넓이 구하기 후 리턴
	 *   calcCircum 원의 둘레 구하기 후 리턴 이파이알
	 *   output 중심 좌표 반지름 크기 둘레 출력
	 *   PI math.PI
	 */
	int x,y;
	double radius;
	
	
	public Ex03_Circle() {
		x=0;
		y=0;
		radius = 1;
	}
	public Ex03_Circle(int r) {
		x=0;
		y=0;
		radius = r;
	}

	public Ex03_Circle(int x, int y, double radius) {
		
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	
	double calcArea() {
		
		return Math.PI*radius*radius;
	}
	
	double calcCircum() {
		return 2*Math.PI*radius;
	}
	
	
	void output() {
		System.out.println("중심 좌표 : " + x +","+ y);
		System.out.println("원 반지름 : " + radius);
		System.out.println("원의 넓이 : " +calcArea());
		System.out.println("원의 둘레 : " +calcCircum());
	}
	
	
}
