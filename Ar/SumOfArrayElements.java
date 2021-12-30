package Ar;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			sum = sum + numbers[i];

		}

		System.out.println(+sum);
		// sum = sum + numbers[i];

	}

}
