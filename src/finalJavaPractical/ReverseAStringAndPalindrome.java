package finalJavaPractical;

public class ReverseAStringAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Madam";

		String rev = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println("Reverse String :" + rev);

		if (str.equals(rev)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Not a Palindrome String");
		}
	}

}
