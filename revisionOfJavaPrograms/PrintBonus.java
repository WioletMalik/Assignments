package revisionOfJavaPrograms;

import java.util.Scanner;

public class PrintBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary = scan.nextInt();
		System.out.println("Enter your years of service");
		int yearsOfService = scan.nextInt();
		scan.close();

		if (yearsOfService > 5) {
			System.out.println("Your Bonus amount is:" + (salary * 0.05));
		} else {
			System.out.println("You are not eligible for bonus");
		}
	}

}
