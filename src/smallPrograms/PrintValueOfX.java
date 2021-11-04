package smallPrograms;

import java.util.Scanner;

public class PrintValueOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();

		if (num <= 10) {
			System.out.println("Value of X is:" + num);
		}
	}

}
