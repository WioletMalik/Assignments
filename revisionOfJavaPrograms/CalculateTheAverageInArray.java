package revisionOfJavaPrograms;

public class CalculateTheAverageInArray {

	public static void main(String[] args) {

		int len = 0;
		double avg = 0;
		int sum = 0;

		int[] marks = { 75, 55, 80, 75 };
		len = marks.length;
		for (int i = 0; i < len; i++) {
			sum = sum + marks[i];
			avg = sum / len;
		}
		System.out.println("Sum of numbers:" + sum);
		System.out.println("Average of marks:" + avg);
	}

}
