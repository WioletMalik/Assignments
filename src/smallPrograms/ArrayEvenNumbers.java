package smallPrograms;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] evenNumbers = new int[10];

		for (int i = 0; i < evenNumbers.length; i++) {

			if (i == 0) {
				evenNumbers[i] = 2;
			} else {
				// get the value at previous index, add 2 to it and store it at current index
					int temp = evenNumbers[i - 1];
					evenNumbers[i] = temp + 2;
			}

			System.out.println(evenNumbers[i]);
		}

	//	int[] evenNumbers = new int[10];

		int j = 0;

		for (int i = 0; i < evenNumbers.length; i++) {
			j = j + 2;
			evenNumbers[i] = j;
			System.out.println(evenNumbers[i]);

		}
	}

}
