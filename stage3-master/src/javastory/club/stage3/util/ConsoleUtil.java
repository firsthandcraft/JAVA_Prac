package javastory.club.stage3.util;

import java.util.Scanner;

public class ConsoleUtil {
	//
	private Scanner scanner;
	private Narrator narrator; 

	public ConsoleUtil(Object target) {
		// 
		this.scanner = new Scanner(System.in); 
		this.narrator = new Narrator(target.getClass().getSimpleName(), TalkingAt.Left); 
	}
	
	public ConsoleUtil(Narrator narrator) {
		// 
		this.scanner = new Scanner(System.in); 
		this.narrator = narrator; 
	}
	
	public String getValueOf(String label){
		//
		narrator.say(label + ": ");
		String inputStr = scanner.nextLine(); //콘솔에 입력한 모든 줄을 받을것
		inputStr = inputStr.trim();
		return inputStr;
	}
}