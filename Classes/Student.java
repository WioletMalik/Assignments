package Classes;

public class Student {
	// variables

	public Student() {

	}

	String name;
	int rollNo;
	String course;

	public int getRollNo() {
		return rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(String name, int rollNo, String course) {

		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	public void getName() {

		System.out.println("name of the student:" + name);
	}
}
