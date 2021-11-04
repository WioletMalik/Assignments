package smallPrograms;

import java.util.Scanner;

public class PrintAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius = scan.nextInt();

		System.out.println("Arean of the circle:" + (3.13 * radius * radius));

	}

}
