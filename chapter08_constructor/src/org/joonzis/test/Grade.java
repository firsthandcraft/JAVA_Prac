package org.joonzis.test;

public class Grade {
	int kor, eng, mat;
	double aver;
	char grade;

	public Grade() {

	}

	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		aver = getAverage();
		grade = getGrade();
	}

	double getAverage() {

		return (kor + eng + mat) / 3.0;
	}

	char getGrade() {
		if (aver >= 90) {
			return 'A';

		} else if (aver >= 80) {
			return 'B';
		} else {
			return 'F';
		}

	}

}
