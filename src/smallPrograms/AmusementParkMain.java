package smallPrograms;

import java.util.Scanner;

public class AmusementParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		System.out.println("Enter your weight");
		double weight = scan.nextDouble();

		AmusementPark amusement = new AmusementPark(height, weight);
		amusement.eligibility();
		scan.close();

	}

}
