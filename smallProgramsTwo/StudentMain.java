package smallProgramsTwo;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		student1.getStuData(101, "wiolet");
		student1.stuMarks(98, 75, 66);

		student1.display();
		student1.totalMarks();
	}

}
