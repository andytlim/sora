package me.kikimasu.sora.run;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import me.kikimasu.sora.utility.Download;

import com.sun.istack.internal.logging.Logger;

public class Sora {
	
	private static final Logger log = Logger.getLogger(Sora.class);
	
	public static void main(String[] args) throws MalformedURLException, UnsupportedAudioFileException, IOException {
		
        
//		AudioInputStream input = AudioSystem.getAudioInputStream(new URL("https://toka.io/assets/audio/chat.mp3"));
//		DataLine.Info info = new DataLine.Info(Clip.class, input.getFormat());
//		System.out.println(input.getFormat());
//		
//		byte[] buffer = new byte[8192];
//	    int bytesRead;
//	    ByteArrayOutputStream output = new ByteArrayOutputStream();
//	    while ((bytesRead = input.read(buffer)) != -1)
//	    {
//	        output.write(buffer, 0, bytesRead);
//	    }
//	    
//	    OutputStream outputStream = new FileOutputStream (new File("src/main/resources/audio/audio.mp3")); ;
//	    output.writeTo(outputStream);
	}
}
