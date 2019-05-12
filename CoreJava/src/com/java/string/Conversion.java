package com.java.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws Exception {
		String str = "120";
		int i = Integer.parseInt(str); 
		System.out.println(i + i);
		String st = Integer.toString(i); 
		String st1 = String.valueOf(i);
		System.out.println(st + st1);

		System.out.println("converting string to long-----------");
		String strr = "100";
		long ab = Long.parseLong(strr);
		System.out.println(ab + ab);
		String s = String.valueOf(ab);
		String s1 = Long.toString(ab);
		System.out.println(s + s1);

		System.out.println("converting String to float-----------------");
		String fl = "234.5";
		float f = Float.parseFloat(fl);
		System.out.println(f + f);
		float f1 = 23.4f;
		String sf = String.valueOf(f1);
		String sf1 = Float.toString(f1);
		System.out.println(sf + sf1);

		System.out.println("converting String to double-----------------");
		String d = "20.34";
		double d1 = Double.parseDouble(d);
		System.out.println(d1 + d1);
		double da = 12.34;
		String sd = String.valueOf(da);
		String sd1 = Double.toString(da);
		System.out.println(sd + sd1);

		System.out.println("converting String to date-----------------");
		String date = "12-may-2016";
		Date date1 = new SimpleDateFormat("dd-mon-yyyy").parse(date);
		System.out.println(date + "t" + date1);

	}

}
