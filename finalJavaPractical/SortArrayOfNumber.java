package finalJavaPractical;

import java.util.Arrays;

public class SortArrayOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 7, 4, 5, 9, 2 };
		System.out.println("Array Before Sorting:" + Arrays.toString(a));

		int n = a.length;

		for (int i = 0; i < n - 1; i++) // number of passes
		{
			for (int j = 0; j < n - 1; j++) // iteration in each array
			{
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("Array Before Sorting:" + Arrays.toString(a));
	}

}
