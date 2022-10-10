package org.joonzis.test;

public class SingerSongMain {
	public static void main(String[] args) {

		Song kpop = new Song("아리랑", "한국");
		Singer si = new Singer("조수미");
		si.setSong(kpop); // 클래스타입으로 만들었을때는 그에 맞는 객체값을 넣어서 가능 ㄷㄷㄷㄷ
		si.output();

	}
}
