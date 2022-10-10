package org.joonzis.test;

public class Song {

	String title;

	String country;

	public Song() {

	}

	public Song(String t, String c) {
		title = t;
		country = c;

	}

	void output() {

		System.out.println("제목 : " + title);
		System.out.println("지역 : " + country);

	}

}
