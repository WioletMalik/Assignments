package revisionOfJavaPrograms;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 0;
		String str = "Anagnorisis";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's')
				index++;
		}
		System.out.println(index);
	}

}
