package smallPrograms;

import java.util.Scanner;

public class PrintYouHaveFever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temprature");
		int temp = scan.nextInt();

		if (temp > 36) {
			System.out.println("You have fever");
		} else if (temp < 36) {
			System.out.println("You do not have fever");
		}
	}

}
