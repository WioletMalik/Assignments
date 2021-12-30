package interviewQuestions;

public class CheckIfGivenNumberIsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;

		int count = 0;

		if (num > 1) {
			for (int i = 0; i < num; i++) {
				if (num % i == 0)
					;
			}
			if (count == 2) {
				System.out.println("This is a prime number ");
			} else {
				System.out.println("Not a Prime Number");
			}
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
