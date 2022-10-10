package org.joonzis.test;

import java.util.Calendar;

public class Car {

	String model, color;
	int year;

	void setFields(String _model, String _color) {

		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		this.model = _model;
		color = _color;

	}

	void setFields(String _model, String _color, int _year) {
		model = _model;
		color = _color;
		year = _year;

	}

	void output() {

		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
	}

}
