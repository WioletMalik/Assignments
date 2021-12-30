package InterviewProgramms;

public class PrintEvenAndOddNumbersfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10];
		// putting value in array
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		// Extracting Even Numbers
		System.out.println("Even numbers in array");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}

		// Extracting Odd Numbers
		System.out.println("Odd numbers in array");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}

		}

	}
}
