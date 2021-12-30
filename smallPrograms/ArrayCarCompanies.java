package smallPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCarCompanies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carCompanies = { "Volvo", "Bmw", "Ford", "Mazda", "Hyundai", "Mahindra", "Maruti", "Tata", "Toyota",
				"Renault" };

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the car name");
		int car = input.nextInt();
		boolean isFound = false;

		for(int i =0;i<carCompanies.length;i++) {
		 if(carCompanies[i].equalsIgnoreCase(input)) {
			System.out.println("Car name Found");
		 boolean = true;
		 
		} else {
			System.out.println("Match Not Found");
			
		}
	
	}

}
