package JavaAssignments;

import java.util.Scanner;

public class PlaindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int org_num = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

			System.out.println(rev);

		}

		if (org_num == rev) {
			System.out.println(org_num + "Number is a plaindrome");
		} else {
			System.out.println(org_num + "Not a plaindrome");

		}
	}
}
