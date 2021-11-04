package constructors;

import Classes.Student;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School main = new School("Jyoti", "Maths");
		Student student1 = new Student();
		student1.setRollNo(1);
		student1.setName("Jijo");
		student1.setCourse("Maths");
		main.enrollStudent(student1, student1.getRollNo());

		Student student2 = new Student("Wiolet", 2, "Maths");
		main.enrollStudent(student2, student2.getRollNo());

		Student student3 = new Student("Gurmeen", 3, "Maths");
		main.enrollStudent(student3, student3.getRollNo());

	}

}
