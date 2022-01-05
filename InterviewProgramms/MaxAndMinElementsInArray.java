package InterviewProgramms;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 50, 40, 30, 20, 10 };
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}

		System.out.println("Maximim element in array:" + max);
	}

}
