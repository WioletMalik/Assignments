package smallProgramsTwo;

import java.util.Scanner;

public class AmusementParkRideMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height");
		int h = scan.nextInt();
		System.out.println("Enter your weight");
		int w = scan.nextInt();

		scan.close();

		AmusementParkRide ride = new AmusementParkRide(h, w);
		ride.measureHeightWeight();

	}

}
