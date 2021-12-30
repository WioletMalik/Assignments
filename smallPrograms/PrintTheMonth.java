package smallPrograms;

import java.util.Scanner;

public class PrintTheMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		month = scan.nextInt();
		scan.close();

		if (month == 1) {
			System.out.println("The Month is January");
		} else if (month == 2) {
			System.out.println("The Month is Febrary");
		} else if (month == 3) {
			System.out.println("The Month is March");
		} else if (month == 4) {
			System.out.println("The Month is April");
		} else if (month == 5) {
			System.out.println("The Month is May");
		} else if (month == 6) {
			System.out.println("The Month is June");
		} else if (month == 7) {
			System.out.println("The Month is July");
		} else if (month == 8) {
			System.out.println("The Month is August");
		} else if (month == 9) {
			System.out.println("The Month is September");
		} else if (month == 10) {
			System.out.println("The Month is October");
		} else if (month == 11) {
			System.out.println("The Month is November");
		} else if (month == 12) {
			System.out.println("The Month is December");
		} else {
			System.out.println("Invalid Input");
		}
	}

}