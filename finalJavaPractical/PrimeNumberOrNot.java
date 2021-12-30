package finalJavaPractical;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;

		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % 1 == 0)
					count++;
			}

			if (count == 2) {
				System.out.println("It is a Prime number");
			} else {
				System.out.println("Not a Prime number");
			}
		}

		else {
			System.out.println("Not a Prime number");
		}
	}

}
