package constructors;

import Classes.Student;

public class College {

	String name;
	String course;

	// Use Student class(from another package) as class level variable in College
	// class
	// this is an array of students to store objects of Student class

	Student[] students;

	public College(String name, String course) {

		this.name = name;
		this.course = course;
		students = new Student[40];

	}

	// enroll students in our course
	// Using Student object as my method args
	public void enrollStudent(Student student, int rollNo) {

		students[rollNo - 1] = student;

	}

}
