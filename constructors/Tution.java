package constructors;

import Classes.Student;

public class Tution {

	
	String name;
	String subjects;
	Student[] studentsObjects;
 
	public Tution(String name, String subjects) {

		this.name = name;
		this.subjects = subjects;
		this.studentsObjects = new Student[40];

	}

	public void enrollStudent(Student studentObject, int rollNo) {
		studentsObjects[rollNo - 1] = studentObject;

	}

}
