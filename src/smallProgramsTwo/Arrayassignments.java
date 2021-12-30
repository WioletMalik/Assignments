package smallProgramsTwo;

public class Arrayassignments {

	public static void main(String[] args) {

		// calculate sum values of array
		/*
		 * int a[] = { 2, 3, 5, 6, 7 }; int sum = 0;
		 * 
		 * for (int i = 0; i < a.length; i++) { sum = sum + a[i]; }
		 * System.out.println("Sum of elements:" + sum); }
		 */

		// search specific number in array

		/*
		 * int a[] = { 2, 5, 6, 7, 8, 2, 4 }; int num = 8; for (int i = 0; i < a.length;
		 * i++) { if (num == a[i]) { System.out.println("element is found at :" + i); }
		 * }
		 */

		// search specific string in array

		/*
		 * String a[] = { "sum", "one", "two", "three", "four" }; String searchFor =
		 * "one"; for (int i = 0; i < a.length; i++) { if (searchFor.equals("nine")) { }
		 * } System.out.println("String found"); } else {
		 * System.out.println("Not Found"); }
		 */

		// find even odd numbers in array

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Number is even number:" + a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("Number is odd number:" + a[i]);
			}
		}
		// greatest and smallest number in array

		int b[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int largest = b[0];
		int smallest = b[0];

		for (int i = 0; i < a.length; i++) {
			if (b[i] > largest)
				largest = b[i];
		}
		// else if(b[i]<smallest) {
		// smallest =b[i];

	}
}
