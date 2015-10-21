package me.kikimasu.sora.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class AudioFile extends PlaybackListener implements Runnable {
	
	private static final Logger log = LoggerFactory.getLogger(AudioFile.class);
	private String filePath;
	private AdvancedPlayer player;
	private Thread playerThread;

	public AudioFile(String filePath) {
		this.filePath = filePath;
	}

	public void play() {
		try {
			String urlAsString = "file:///"
					+ new java.io.File(".").getCanonicalPath() + "/"
					+ this.filePath;

			this.player = new AdvancedPlayer(
					new java.net.URL(urlAsString).openStream(),
					javazoom.jl.player.FactoryRegistry.systemRegistry()
							.createAudioDevice());

			this.player.setPlayBackListener(this);

			this.playerThread = new Thread(this, "AudioPlayerThread");

			this.playerThread.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void playbackStarted(PlaybackEvent playbackEvent) {
		log.info("playbackStarted");
	}

	public void playbackFinished(PlaybackEvent playbackEvent) {
		log.info("playbackEnded");
	}

	public void run() {
		try {
			this.player.play();
		} catch (javazoom.jl.decoder.JavaLayerException ex) {
			ex.printStackTrace();
		}

	}
}
