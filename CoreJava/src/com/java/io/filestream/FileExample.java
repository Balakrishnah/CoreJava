package com.java.io.filestream;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		createFile();
		getFileList();
		createDirectory();
	}
	
	public static void getFileList(){
		String path ="C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem";
		File file = new File(path);
		String[] fileList = file.list();
		for(String name :fileList){
			System.out.println(name);
		}
	}
	
	public static void createFile() throws IOException{
		
		File file = new File("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\demoFile.txt");
		if(file.exists()){
			System.out.println("The File is already exists");
		}		
		if (file.createNewFile()){
			System.out.println("File is created");
		}else{
			System.out.println("File is not created");
		}
	}
	public static void createDirectory(){
		File file = new File("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\Babu").getParentFile();
		if (!file.isDirectory()){
			file.mkdir();
			System.out.println("The Directory is created ");
		}else{
			System.out.println("The Directory is already exists");
		}
	}
}
