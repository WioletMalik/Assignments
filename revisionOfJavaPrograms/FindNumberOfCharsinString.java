package revisionOfJavaPrograms;

public class FindNumberOfCharsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charsCount = 0;
		String string = "Canada is the best country to live";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				charsCount++;
		}

		System.out.println("Chars in string:" + charsCount);
	}

}
