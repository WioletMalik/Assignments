package revisionOfJavaPrograms;

public class RepeatOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {
				"I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy" };

		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("happy"))
				count++;
		}
		System.out.println();
	}

}
