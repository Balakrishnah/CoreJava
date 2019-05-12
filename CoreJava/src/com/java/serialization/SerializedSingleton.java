package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
 //Tutorial link: https://www.journaldev.com/2452/serialization-in-java
public class SerializedSingleton implements Serializable{
	private static final long serialVersionUID = 3701070136085502212L;
	private static SerializedSingleton instance;
	private SerializedSingleton(){}
	public static SerializedSingleton getInstance(){
		if(null == instance){
			instance = new SerializedSingleton();
		}
		return instance;		
	}
	
	protected Object readResolve(){
		return getInstance();
	}
	
	public static void main(String[] args) {
		try {
			SerializedSingleton singleton = SerializedSingleton.getInstance();
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\serialSigleton.txt"));
			outputStream.writeObject(singleton);
			outputStream.close();
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\BALAKRISHNA H\\Learning Documents\\Java\\FileSystem\\serialSigleton.txt"));
			 SerializedSingleton singleton2 = (SerializedSingleton) inputStream.readObject();
			 long singletonSerialUID = ObjectStreamClass.lookup(SerializedSingleton.class).getSerialVersionUID();
			 System.out.println("singletonSerialUID: "+singletonSerialUID);
			 inputStream.close();
			 System.out.println("the singleton hashcode:"+singleton.hashCode());
			 System.out.println("The singleton2 hashcode is :"+singleton2.hashCode());
		} catch (IOException | ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}

	
}
