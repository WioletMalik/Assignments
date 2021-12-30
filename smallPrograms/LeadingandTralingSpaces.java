package smallPrograms;

public class LeadingandTralingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "                Canada is the best country in the world                                 ";

		System.out.println("Our String value before applying the trim method:" + str);

		System.out.println("Our String value after applying the trim method:" + str.trim());

		String s1 = "My name is";
		String s2 = " John";

		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);

		// Concatenate the two strings together
		String s3 = s1.concat(s2);

		// Display the new String
		System.out.println("The concatenated string: " + s3 );

	}

}
