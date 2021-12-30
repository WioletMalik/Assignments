package finalJavaPractical;

public class SubstringToAnotherString {

	public static boolean isSubstring(String main, String sub) {

		return main.matches("(.*)" + sub + "(.*)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSubstring("My Java Project", "Project"));
	}

}
