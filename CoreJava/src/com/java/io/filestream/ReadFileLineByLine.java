package com.java.io.filestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileLineByLine {
	public static void main(String[] args) {
		System.out.println("*******************Using Buffered reader**********************************");
		readFileLineByLineUsingBufferedReader();
		
		System.out.println("*******************Using Files**********************************");
		readFileLineByLineUsingFiles();
	}

	public static void readFileLineByLineUsingBufferedReader() {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\fileReadLineByLine.txt"));
			String name ;
			while (null !=(name = bufferedReader.readLine())) {
				System.out.println(name);
				//name = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFileLineByLineUsingFiles(){
		try {
			List<String> lineList = Files.readAllLines(Paths.get("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\fileReadLineByLine.txt"), Charset.defaultCharset());
			for(String singleLine:lineList){
				System.out.println(singleLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
