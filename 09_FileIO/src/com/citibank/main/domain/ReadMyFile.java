package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

public class ReadMyFile {
	private String path = "C:\\JavaTraining/test.txt";
	private InputStream inputStream;
	private byte[] data = new byte[100];
	private int arrayLength;

	public void readFile() {
		try {
			
			File file = new File(path);
			arrayLength = (int) file.length();
			data = new byte[arrayLength];
			
			inputStream = new FileInputStream(path);
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("Error in file reading");
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Failed in closing file");
				e.printStackTrace();
			}
		}
	}
}
