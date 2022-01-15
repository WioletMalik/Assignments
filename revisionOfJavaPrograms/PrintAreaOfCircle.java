package revisionOfJavaPrograms;

import java.util.Scanner;

public class PrintAreaOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the raidus");
		int radiusEntered = scan.nextInt();
		scan.close();

		double CircleArea = (3.14 * radiusEntered * radiusEntered);

		System.out.println("Circle area is :" + CircleArea);
	}

}
