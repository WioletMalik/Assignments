package InterviewProgramms;

public class MissingNumbersinArray {

	public static void main(String[] args) {

		// Array should not have duplicates
		// Array NO NEED to be sorted order
		// Value should be in proper range

		int[] num = { 1, 2, 4, 5 };

		// 1+2+4+5=12 sum1
		// 1+2+3+4+5=15 sum2
		// sum1-sum2 = 15-12 = 3 missing

		int sum1 = 0;
		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i];
		}
		System.out.println("sum of elements of array:" + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range of elements of array:" + sum2);

		System.out.println("Missing number:" + (sum2 - sum1));
	}
}
