package InterviewProgramms;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myFirstArray = { 12, 42, 34, 19 };
		int[] mySecondArray = { 12, 42, 34, 19 };

		boolean status = Arrays.equals(myFirstArray, mySecondArray);

		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are NOT Equal");
		}
	}

}
