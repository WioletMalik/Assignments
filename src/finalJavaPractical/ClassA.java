package finalJavaPractical;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();

		ClassB bee = new ClassB(firstNumber, secondNumber);

	}

}
