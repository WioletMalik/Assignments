package smallProgramsTwo;

import java.util.Scanner;

public class AgeComparision {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int A = scan.nextInt();
		System.out.println("Enter your age");
		int B = scan.nextInt();
		System.out.println("Enter your age");
		int C = scan.nextInt();

		scan.close();

		if (A > B && A > C) {
			System.out.println("A is the oldest");
		} else {
			System.out.println("A is youngest");
		}
		if (B > A && B > C) {
			System.out.println("B is the oldest");
		} else {
			System.out.println("B is the youngest");
		}
		if (C > A && C > B) {
			System.out.println("C is the oldest");
		} else {
			System.out.println("C is the youngest");
		}
	}

}
