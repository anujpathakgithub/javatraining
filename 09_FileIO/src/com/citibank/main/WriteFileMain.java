package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class WriteFileMain {

	public static void main(String[] args) {
		System.out.println("Main start");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the File Path and file name with Extension");
		String path = scanner.next();
		
		scanner.nextLine();
		System.out.println(" Enter the data to write in file");
		String outMessage = scanner.nextLine();
		
		File file = new File(path);
		
		OutputStream outputStream = null;
		WriteMyFile writeMyFile = null;		
		try {
			outputStream = new FileOutputStream(file,true);
			writeMyFile = new WriteMyFile( outputStream, outMessage);
			if (writeMyFile.writeFile()) {
				System.out.println("Please check your file");
			}
			else {
				System.out.println("Failed to write File");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
