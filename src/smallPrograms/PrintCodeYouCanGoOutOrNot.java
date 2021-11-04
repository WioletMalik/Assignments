package smallPrograms;

import java.util.Scanner;

public class PrintCodeYouCanGoOutOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Have you done homework");
		String Answer = scan.next();
		System.out.println("Have you cleaned your room");
		String Reply = scan.next();

		if (Answer.equalsIgnoreCase(Reply)) {
			System.out.println("You can go out");
		} else if (!Answer.equalsIgnoreCase(Reply)) {
			System.out.println("You cannot go out");
		}
	}

}
