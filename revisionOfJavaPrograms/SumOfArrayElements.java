package revisionOfJavaPrograms;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int[] a = { 30, 40, 50, 60 };
		int sum = 0;
		int len = a.length;

		for (int i = 0; i < len; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
