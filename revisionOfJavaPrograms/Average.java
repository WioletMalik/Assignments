package revisionOfJavaPrograms;

import java.util.Scanner;

public class Average {

	public void calculateAverge() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter second Number");
		int secondNumber = scan.nextInt();
		System.out.println("Enter third Number");
		int thirdNumber = scan.nextInt();
		scan.close();

		int average = (firstNumber + secondNumber + thirdNumber / 3);
		System.out.println("Average of three numbers:" + average);
	}

}
