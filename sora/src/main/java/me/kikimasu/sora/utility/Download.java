package me.kikimasu.sora.utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Download {
	
	private static final Logger log = LoggerFactory.getLogger(Download.class);
	public static final int bufferSize = 8192;
	
	public static void downloadAudioFile(String url, String path) throws MalformedURLException, IOException {
		InputStream is = new URL(url).openStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream outputStream = new FileOutputStream(new File(path + "/" + KeyGen.getRandomString(12) + getFileExtension(url))); 
        int bytesRead = -1;
        byte[] buffer = new byte[bufferSize];
        while ((bytesRead = bis.read(buffer)) != -1) {
        	outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
	}
	
	public static void downloadAudioFile(String url, String path, String fileName) throws MalformedURLException, IOException {
		InputStream is = new URL(url).openStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream outputStream = new FileOutputStream(new File(path + "/" + fileName + getFileExtension(url))); 
        int bytesRead = -1;
        byte[] buffer = new byte[bufferSize];
        while ((bytesRead = bis.read(buffer)) != -1) {
        	outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
	}

	
	public static String getFileExtension(String fileString) {
		return fileString.substring(fileString.lastIndexOf("."), fileString.length());
	}
}
