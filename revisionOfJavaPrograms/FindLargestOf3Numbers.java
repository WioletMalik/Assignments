package revisionOfJavaPrograms;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		if (a > b && a > c) {
			System.out.println("a is the largest number");
		} else if (b > a && b > c) {
			System.out.println("a is the largest number");
		} else {
			System.out.println("c is the largest number");
		}
	}

}
