package com.java.io.filestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) {
		getFileReaderEx();
		getFileWriterEx();
	}
	
	/**
	 * This is file writer 
	 */
	private static void getFileWriterEx(){
		try {
			FileWriter writer = new  FileWriter("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\fileReaderWriter.txt");
			writer.write("Hi This file writer");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This is file reader
	 */
	private static void getFileReaderEx(){
		try {
			FileReader reader = new  FileReader("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\fileReaderWriter.txt");
			int i;
			while((i=reader.read())!= -1){
				System.out.println((char)i);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
