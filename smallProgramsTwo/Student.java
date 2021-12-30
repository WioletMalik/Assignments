package smallProgramsTwo;

public class Student {

	int Sid;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;

	void getStuData(int stuId, String stuName) {
		this.Sid = stuId;
		this.Sname = stuName;

	}

	void display() {
		System.out.println(Sid + " " + Sname);
		System.out.println(Sub1 + "  " + Sub2 + " " + Sub3);
	}

	void stuMarks(int sub1Marks, int sub2Marks, int sub3Marks) {
		this.Sub1 = sub1Marks;
		this.Sub2 = sub2Marks;
		this.Sub3 = sub3Marks;
	}

	void totalMarks() {
		System.out.println("Total marks are :" + (Sub1 + Sub1 + Sub1));
	}
}
