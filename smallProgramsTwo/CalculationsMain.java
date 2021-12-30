package smallProgramsTwo;

import java.util.Scanner;

public class CalculationsMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter base price of car");
		double basePrice = scan.nextDouble();
		System.out.println("Please enter installment years");
		int yearsOfInstallment = scan.nextInt();
		scan.close();

		Calculations cal = new Calculations(basePrice, yearsOfInstallment);
		System.out.println("Final car cost is:" + cal.carCost());

	}

}
