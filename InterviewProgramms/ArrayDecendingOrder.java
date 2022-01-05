package InterviewProgramms;

import java.util.Arrays;

public class ArrayDecendingOrder {

	public static void main(String[] args) {

		int[] num = { 5, 3, 7, 9, 2, 1 };

		int n = num.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("Array after sorting:" + Arrays.toString(num));
	}

}
