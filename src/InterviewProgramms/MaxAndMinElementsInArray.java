package InterviewProgramms;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] num = { 50, 30, 40, 20, 60 }; int max = num[0]; for (int i = 1; i <
		 * num.length; i++) { if (num[i] > max) { max = num[i]; } }
		 * System.out.println("Maximum element in array:" + max);
		 */
		int[] num = { 50, 30, 40, 20, 60 };
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Minimum element in array:" + min);
	}

}
