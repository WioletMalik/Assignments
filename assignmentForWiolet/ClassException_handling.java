package assignmentForWiolet;

public class ClassException_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.print("Hello" + " " + 1 / 0);
		} catch (ArithmeticException e) {
			System.out.print("World");
		}
	}

}
