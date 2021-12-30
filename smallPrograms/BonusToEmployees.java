package smallPrograms;

import java.util.Scanner;

public class BonusToEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary = scan.nextDouble();
		System.out.println("Enter your years of service");
		int yearsOfService = scan.nextInt();

		if (yearsOfService > 5) {
			System.out.println("Bonus payout:" + (salary * 0.05));
		} else {
			System.out.println("Bonus not applicable");
		}
	}

}
