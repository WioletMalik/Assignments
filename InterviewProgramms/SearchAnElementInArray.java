package InterviewProgramms;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = false;
		int[] num = { 20, 30, 40, 50 };
		int search_element = 50;
		for (int i = 0; i < num.length; i++) {
			if (search_element == num[i]) {
				System.out.println("Element found at:" + i);
				flag = true;
				break;
			}

			if (flag = false) {
				System.out.println("Element not found");
			}

		}
	}

}
