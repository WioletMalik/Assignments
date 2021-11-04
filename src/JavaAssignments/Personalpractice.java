package JavaAssignments;

public class Personalpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find if marks +80 is present in array and its index

		// two ways of creating strings
		String s = "wiolet ginotra";
		String s1 = new String("Wiolet ginotra");
		String s2 = new String("jitin ginotra");

		// case sensitive comparison strings

		// boolean areStringsEqual = s1.equals(s2);

		System.out.println(s.equalsIgnoreCase(s1));

		// find of the length of string

		System.out.println("length of my string is : " + s.length());

		// to combine two strings ,concatination of two strings and storing the value in
		// third string

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + str2;

		System.out.println();

		// find exactly where is char is located

		String randomString = "house a house";

		System.out.println(randomString.length());

		System.out.println("index of b in bought:" + randomString.indexOf('b'));

		// Find the word in PR

		System.out.println("index of word house in:" + randomString.indexOf("house"));

		// Find a word in a String

		System.out.println("random String contains string house:" + s.contains("house"));

		// find if the string is blank

		String j = "s";

		System.out.println("find string is empty :" + j.isBlank());
		
		if(j.equals("s")) {
			System.out.println("String is blank");
		}else {	
			System.out.println("String is not blank");
		}
		//replace a word/character
		
		System.out.println("name before changing surname:"+j);
		
		String Newname=s.replace("wiolet ginotra", "druvik");
		
		System.out.println("name changed to"+ Newname);
		
		System.out.println("Replace characters"+s.replaceAll("i", "e"));
		
		// extract first name
		
		String fullName = "Wiolet Ginotra";
		
		String firstName = fullName.substring(0,7);
		
		System.out.println("firstName:"+firstName);
		
		String lastName = fullName.substring(7);
		
		System.out.println("last name:"+lastName);
		
		//String statement
		
		String stmt = "Canada is my country in world";
		
		int indexcountry = stmt.indexOf("country");
		
		int endIndex = stmt.indexOf("in");
		
		System.out.println(stmt.substring(indexcountry, endIndex));
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
			
		}
		

	}


