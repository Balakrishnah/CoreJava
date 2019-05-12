package com.java.io.filestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStream {

	public static void main(String[] args) {
		//byteArrayOutputStreamEx();
		byteArrayInputStreamEx();

	}
	public static void byteArrayInputStreamEx(){
		byte[] bytesInData ={10,20,30,49};
		ByteArrayInputStream byteIn = new ByteArrayInputStream(bytesInData);
		int i;
		while((i=byteIn.read())!= -1){
			System.out.println((char)i);
		}
		System.out.println("success");
	}
	
	public static void byteArrayOutputStreamEx(){
		try {
			FileOutputStream fout1 = new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\byteArrayStream1.txt");
			FileOutputStream fout2 = new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\byteArrayStream2.txt");
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			String str ="This is Byte Input Output Stream 123";
			byteOut.write(str.getBytes());
			byteOut.writeTo(fout1);
			byteOut.writeTo(fout2);
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
