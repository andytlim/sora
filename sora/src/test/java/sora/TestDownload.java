package sora;

import static org.junit.Assert.*;

import org.junit.Test;

import me.kikimasu.sora.utility.Download;

public class TestDownload {
	
	@Test 
	public void testDownload() {
		try {
			Download.downloadAudioFile("https://toka.io/assets/audio/chat.mp3", "src/test/resources");
		} catch (Exception e) {
			fail("Unable to download file.");
			e.printStackTrace();
		}
	}
}
