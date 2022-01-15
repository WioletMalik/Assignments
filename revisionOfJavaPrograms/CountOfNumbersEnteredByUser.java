package revisionOfJavaPrograms;

import java.util.Scanner;

public class CountOfNumbersEnteredByUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;

		for (int i = 1; i > 0; i++) {
		}
		System.out.println("Enter as many numbers as you want");
		int numbersEntered = scan.nextInt();
		if (numbersEntered > 0)
			count++;

		System.out.println("Count of Digits:" + count);
	}

}
