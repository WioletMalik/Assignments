package smallPrograms;

import java.util.Scanner;

public class Array100Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = scan.nextInt();

		int[] num = new int[100];
		for (int n = 0; n < num.length; n++) {
			num[n] = n + 1;
			System.out.println(num[n]);

		}

		if (num[45] == 46) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
