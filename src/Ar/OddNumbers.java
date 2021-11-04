package Ar;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an array
		int[] oddNumbers = new int[10];

		// Add value in array

		for (int i = 0; i < oddNumbers.length; i++) {

			if (i == 0) {
				oddNumbers[i] = 1;
				
			} else {
				int temp = oddNumbers[i - 1];
				oddNumbers[i] = temp + 2;
			}
			System.out.println(oddNumbers[i]);
		}

	}
}
