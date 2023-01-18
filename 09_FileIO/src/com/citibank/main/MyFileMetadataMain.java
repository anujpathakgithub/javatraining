package com.citibank.main;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileMetadata fileMetadata = new MyFileMetadata();

		fileMetadata.prinFileMetadata();
		System.out.println("----------");
		ReadMyFile myFile= new ReadMyFile();
		myFile.readFile();

}
}
