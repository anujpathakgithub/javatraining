package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	private BufferedReader bufferedReader;
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}
	public MyFileReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readFileLineByLine() {
		try {
			String fileData = bufferedReader.readLine();
			return fileData;
		} catch (IOException e) {
			System.out.println("Error while reading file");
			return "";
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error while Closing bufferedReader");
			}
		}
	}
	public String readFile() {
		try {
			length= (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile;
		} catch (IOException e) {
			System.out.println("Error while Reading file");
			return "";
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error in file closing");
			}
		}
	}
}
