package Ar;

import java.util.Scanner;

public class FindCityNameInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities = { "Brampton", "Northyork", "London" };
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter City name");
		String Cities = scan.next();

		if (Cities.equalsIgnoreCase(Cities)) {
			System.out.println("City name found");
		} else if (Cities.equalsIgnoreCase(Cities)) {
			System.out.println("City not found in the list");
		}

	}

}
