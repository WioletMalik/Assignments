package interviewQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("new value of a :" + a);
		System.out.println("new value of b :" + b);

	}

}
