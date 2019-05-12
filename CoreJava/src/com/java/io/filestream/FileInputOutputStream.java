package com.java.io.filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	// This stream is best for write  byte oriented data.
	public static void main(String[] args) {		
		fileOutputStreamEx();
		fileInputStreamEx();
	}

	public static void fileInputStreamEx() {
		try(FileInputStream fin = new FileInputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\inputstream.txt")) {
			int i;
			while ((i = fin.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileOutputStreamEx() {
    try(FileOutputStream fout = new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\inputstream.txt",false)) {
    	String str = "Hi this is ebay payment dispute project \n";
    	fout.write(str.getBytes());
    	fout.flush();
    	System.out.println("Success.....");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
