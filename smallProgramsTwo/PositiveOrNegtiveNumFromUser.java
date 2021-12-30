package smallProgramsTwo;

import java.util.Scanner;

public class PositiveOrNegtiveNumFromUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");

		int numberEntered = scan.nextInt();

		scan.close();

		if (numberEntered > 0) {
			System.out.println("This is a Positive Number");
		} else {
			System.out.println("This is a Negative Number");
		}

	}

}
