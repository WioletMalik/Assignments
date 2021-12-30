package InterviewProgramms;

public class OccuranceOdCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Programming Java Oops";

		int totalcount = s.length(); // total length

		int totalCount_afterRemove = s.replaceAll("a", "").length();

		int count = totalcount - totalCount_afterRemove;
		System.out.println("Number of occurance of a is :" + count);
	}

}
