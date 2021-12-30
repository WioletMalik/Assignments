package smallProgramsTwo;

import java.util.Scanner;

public class BonusToEmployees {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Salary");
		int salary = scan.nextInt();
		System.out.println("Enter year of experience");
		int yoe = scan.nextInt();
		scan.close();

		if (yoe >= 5) {
			System.out.println("Your net Bonus is:" + salary * 5 / 100);
		} else {
			System.out.println("You are not elegible for bonus");
		}

	}

}
