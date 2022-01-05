package InterviewProgramms;

public class RevAStringAndPalindrome {

	public static void main(String[] args) {

		String s = "nikki";

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Is is Palindrome String");
		} else
			System.out.println("Is is not Palindrome String");
	}

}
