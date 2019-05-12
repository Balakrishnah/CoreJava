package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) {
		Employee employee = new Employee("Babu", 27, "ISE");
		
		try {
			System.out.println("Start");
			FileOutputStream fout = new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\serial.txt");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fout);
			objectOutput.writeObject(employee);
			fout.flush();
			fout.close();
			System.out.println("end");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
