package org.joonzis.test;
import java.util.*;
public class Car {
	String model, color;
	int year;
	boolean isNewCar;
	public Car(String model, String color, int year) {
		
		this.model = model;
		this.color = color;
		this.year = year;
		
	}
	
	public Car(String model, String color) {
		
		this.model = model;
		this.color = color;
		Calendar calendar = Calendar.getInstance();
		year= calendar.get(Calendar.YEAR);
		
	}
	
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연도 : " + year);
		System.out.println("새차 : " + ((year>=2020) ? "새차" : "아님"));
		
	}
	
	
	
	
	
}
