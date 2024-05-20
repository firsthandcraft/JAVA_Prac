package javastory.club.stage2.step2;

import javastory.club.stage2.step2.ui.menu.ClubMenu;

public class StoryAssistant {
	//
	public static void main(String[] args) {
		//
		StoryAssistant storyAssistant = new StoryAssistant();
		storyAssistant.start();
	}

	private void start() {
		//
		ClubMenu clubMenu = new ClubMenu();
		clubMenu.show();
	}
}
