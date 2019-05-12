package com.java.io.filestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStream {
	public static void main(String[] args) {
		bufferedOutputStreamExample();
		bufferedInputStreamExample();
	}
	
	public static void bufferedOutputStreamExample(){
		try {
			FileOutputStream fout = new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\bufferedstream.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String str ="Hi This is for buffered input output stream example aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			bout.write(str.getBytes());
			System.out.println("sucess.........");
			bout.flush();
			bout.close();
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bufferedInputStreamExample(){
		try {
			FileInputStream fin = new FileInputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\bufferedstream.txt");
			BufferedInputStream bin = new BufferedInputStream(fin, 5);
			int i;
			while((i=bin.read())!=-1){
				System.out.println((char)i);
			}
			bin.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
