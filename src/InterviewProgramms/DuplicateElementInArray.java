package InterviewProgramms;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "java", "c", "c++", "Python", "java" };

		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Found duplicate element:" + array[i]);
					flag = true;
				}
			}

		}
		if (flag == false) {
			System.out.println("Duplicate element not found");
		}
	}

}
