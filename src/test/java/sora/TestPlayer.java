package sora;

import me.kikimasu.sora.utility.AudioFile;

public class TestPlayer {
	
	public static void main(String[] args) {
		AudioFile audio = new AudioFile("src/test/resources/abc.mp3");
		audio.play();
	}
}
