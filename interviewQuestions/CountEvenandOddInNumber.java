package interviewQuestions;

public class CountEvenandOddInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7312;

		int even_count = 0;

		int odd_count = 0;

		while (num > 0) {
			int reminder = num % 10;

			if (reminder % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}

			num = num / 10;
		}

		System.out.println("Number is Even numbers :" + even_count);
		System.out.println("Number is Odd Count :" + odd_count);
	}
}