package finalJavaPractical;

import java.util.Arrays;

public class DecendingOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 20, 78, 26, 45, 66, 77 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					temp = a[j];
				}
			}

		}
		System.out.println(Arrays.toString(a));

	}

}
