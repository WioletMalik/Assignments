package InterviewProgramms;

import java.util.Random;

public class GenrateRandomandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		// Random Int Number
		int rand_int = rand.nextInt(10);
		System.out.println(rand_int);

		// Random double Number
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
	}

}
