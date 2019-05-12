package com.java.clone;

public class ShallowCopy {

	public static void main(String[] args) {
		Course course = new Course("java", "DataStrucutre", "DotNet");
		Student student1 = new Student(10, "Babu", course);
		Student student2 = null;
		try {
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// Printing the subject3 of 'student1'
		System.out.println("Original Object before changes: "+student1.course.subject3);
		
		System.out.println("Clone Object before changes: "+student2.course.subject3);

		// Changing the subject3 of 'student2'
		student2.course.subject3 = "Maths";

		// This change will be reflected in original student 'student1'
		System.out.println("Original object After changes: "+student1.course.subject3);

		System.out.println("Clone object After changes: "+student2.course.subject3);
	}

}
