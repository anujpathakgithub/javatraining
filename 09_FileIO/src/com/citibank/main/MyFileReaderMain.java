package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;
import com.citibank.main.domain.ReadMyFile;

public class MyFileReaderMain {
	

	public static void main(String[] args) {
		System.out.println("Main start");
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter the File Path and file name with Extension");
		String path = scanner.next();

		File file = new File(path);
		Reader fileReader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			myFileReader = new MyFileReader(bufferedReader);
			
			String data = myFileReader.readFileLineByLine();
			
			System.out.println(data);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		try {
//			fileReader = new FileReader(file);
//			myFileReader = new MyFileReader(file, fileReader);
//			String filedata = myFileReader.readFile();
//			if (filedata.equals("")) {
//				System.out.println("Failed to read file");
//			} else {
//				System.out.println(filedata);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		finally {
//
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				System.out.println("Error in closing file in main");
//			}
//		}

	}

}
