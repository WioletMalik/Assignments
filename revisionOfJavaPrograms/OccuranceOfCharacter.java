package revisionOfJavaPrograms;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String s = "Java programming Java oops";

		int totalCount = s.length();

		int totalCount_afterRemoval = s.replace("a", "").length();

		int count = totalCount - totalCount_afterRemoval;

		System.out.println(count);

	}

}
