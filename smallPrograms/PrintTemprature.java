package smallPrograms;

import java.util.Scanner;

public class PrintTemprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temprature");
		int temp = scan.nextInt();

		if (temp > 30) {
			System.out.println("It is freezing");
		} else if (temp < 30 && temp > 50) {
			System.out.println("It is cold");
		} else if (temp < 50 && temp > 90) {
			System.out.println("It is nice out");
		} else if (temp < 90) {
			System.out.println("It is hot");
		}
	}

}
