package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\serial.txt");
			ObjectInputStream objectIn = new ObjectInputStream(fin);
			Employee emp = (Employee)objectIn.readObject();
			System.out.println(emp.firstName+" "+emp.age+" "+emp.dept+" "+Employee.lastName);
			objectIn.close();
			fin.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
