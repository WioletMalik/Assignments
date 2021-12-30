package interviewQuestions;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;

		if (a < b && a < c) {
			System.out.println("a is smallest");
		} else if (b < a && b < c) {
			System.out.println("b is the smallest");
		} else {
			System.out.println("c is  the smallest");
		}
	}

}
