package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {
	private String path = "C:\\JavaTraining/test.txt";
	public void prinFileMetadata() {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("File Exist");
			System.out.println("File Name::" + file.getName());
			System.out.println("File Path::" + file.getAbsolutePath());
			System.out.println("File Size::" + file.length() + "Bytes");
			System.out.println("Can Open::"  + file.canExecute());
			System.out.println("can Write::" + file.canWrite());
			System.out.println("Can Read::"  + file.canRead());
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modified::" + lastModifiedDate);
			
			
		}
		else {
			System.out.println("File does not exist");
			System.out.println("Enter Valid path");
		}
	}
}
