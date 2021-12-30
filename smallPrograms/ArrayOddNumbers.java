package smallPrograms;

public class ArrayOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] oddNumbers = new int[10];

		int j = 1;

		for (int i = 1; i < oddNumbers.length; i++) {
			j = j + 2;
			oddNumbers[i] = j;
			System.out.println(oddNumbers[i]);

		}

	}

}
