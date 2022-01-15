package revisionOfJavaPrograms;

public class StringManipulation {

	public static void main(String[] args) {

		// length of string
		/*
		 * String str = "The rains have started here";
		 * System.out.println("Length of string:" + str.length());
		 */

		// char at index
		/*
		 * String str = "The rains have started here";
		 * System.out.println("char at idex 5:" + str.charAt(5));
		 */

		// index of char
		/*
		 * String str = "The rains have started here";
		 * System.out.println("index of char:" + str.indexOf('s'));
		 */

		/*
		 * String str = "The rains have started here selinium";
		 * System.out.println("index of second s char:" + str.indexOf('s',
		 * str.indexOf('s')+1));
		 */

		// index od word
		/*
		 * String str = "The rains have started here";
		 * System.out.println(str.indexOf("have"));
		 */

		// String comparison
		/*
		 * String str = "The rains have started here"; String str1 =
		 * "The rains have started Here";
		 * 
		 * System.out.println(str.equalsIgnoreCase(str1));
		 */
		// String substring

		String str = "The rains have started here";
		String str1 = "The rains have started Here";

		System.out.println(str.substring(0, 9));

		// trim and replace method

		System.out.println(str.trim());

		System.out.println(str.replace(" ", ""));

		// split
		String test = "Hello_World_Test_Selenium";

		String[] testWell = str.split("_");

		for (int i = 0; i < testWell.length; i++){
			System.out.println(testWell[i]);
		}
		
	}

}
