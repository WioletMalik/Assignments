package smallPrograms;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize first array

		int[] array1 = new int[] { 1, 2, 3 };

		// Create another array with same size of array 1

		int[] array2 = new int[array1.length];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println("Display the items of second array");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}

	}

}
