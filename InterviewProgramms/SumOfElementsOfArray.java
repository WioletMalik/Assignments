package InterviewProgramms;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			sum = sum + num[i];
		}
		System.out.println(sum);
	}

}
	