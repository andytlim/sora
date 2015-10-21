package sora;

import me.kikimasu.sora.utility.Download;

public class TestDownload {
	
	public static void main(String[] args) {
		try {
			Download.downloadAudioFile("https://toka.io/assets/audio/chat.mp3", "src/test/resources");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
