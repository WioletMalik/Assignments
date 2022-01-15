package revisionOfJavaPrograms;

import java.util.Scanner;

public class PrintTheGrade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the percentage scored");
		double percentage = scan.nextDouble();
		scan.close();

		if (percentage > 0 && percentage <= 50) {
			System.out.println("You have grade D");
		} else if (percentage < 50 && percentage >= 60) {
			System.out.println("You have grade C");
		} else if (percentage < 60 && percentage >= 75) {
			System.out.println("You have grade B");
		} else if (percentage > 75 && percentage <= 100) {
			System.out.println("You have grade A");
		} else {
			System.out.println("Invalid input");
		}

	}

}
