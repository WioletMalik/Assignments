package finalJavaPractical;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 20, 30, 40, 60 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum number is :" + min);
	}

}
