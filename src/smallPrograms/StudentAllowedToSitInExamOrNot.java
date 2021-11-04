package smallPrograms;

import java.util.Scanner;

public class StudentAllowedToSitInExamOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Number of classes held");
		int classesHeld = scan.nextInt();
		System.out.println("Number of classes attended");
		int classesAttended = scan.nextInt();
		System.out.println("Do you have medical cause");
		String Answer = scan.next();

		int percentage = classesHeld / classesAttended * 100;

		if (percentage > 75) {
			System.out.println("Student is allowed to sit in exam");
		} else if (percentage < 75) {
			System.out.println("student is not allowed to sit in exam");
		}
	}

}
