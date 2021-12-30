package finalJavaPractical;

import java.util.Scanner;

public class Replace2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");

		int a = scan.nextInt();

		System.out.println("Enter second number");

		int b = scan.nextInt();

		scan.close();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("New value of a:" + a);
		System.out.println("New value of b :" + b);

	}

}
