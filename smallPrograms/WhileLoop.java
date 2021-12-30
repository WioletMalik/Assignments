package smallPrograms;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		int j = 1;
		while (j < 10) {
			System.out.println(j);
			j++;
		}

		// array while loop

		int arr[] = { 2, 44, 66, 77 };
		int z = 0;
		while (z < 4) {
			System.out.println(arr[z]);
			z++;
		}
		// Do while loop

		int i = 20;
		do {
			System.out.println(i);
			i--;
		} while (i > 10);

		// array do while loop

		int doWhile[] = { 2, 3, 5, 6, 7, 8 };
		int c = 0;
		do {
			System.out.println(doWhile[c]);
			c++;
		} while (c < 6);

	}

}
