package revisionOfJavaPrograms;

import java.util.Scanner;

public class PercentageOfClassesAttended {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Number of classes held");
		int classesHeld = scan.nextInt();
		System.out.println("Number of classes attended");
		int classesAttended = scan.nextInt();

		int AttendancePercentage = ((classesAttended / classesHeld) * 100);

		System.out.println("Attendance percentage is :" + AttendancePercentage);

		System.out.println("Do you have medical condition enter 'Y' or 'N'");

		boolean haveMedicialCondition = scan.nextBoolean();
		boolean noMedicialCondition = scan.nextBoolean();

		if (AttendancePercentage > 75) {
			System.out.println("Student is allowed to sit in exam");
		} else if (haveMedicialCondition) {
			System.out.println("Student is allowed to sit in exam");
		} else {
			System.out.println("Student is not allowed to sit in exam");
		}
	}

}
