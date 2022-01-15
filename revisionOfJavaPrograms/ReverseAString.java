package revisionOfJavaPrograms;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "nisha";
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(str)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}

	}
}