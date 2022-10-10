package org.joonzis.test;

public class Singer {

	String name;
	Song song;

	public Singer() {

	}

	public Singer(String n) {
		name = n;

	}

	void setSong(Song s) {

		song = s;
	}

	void output() {
		song.output();
		System.out.println("가수 이름 : " + name);

	}

}
