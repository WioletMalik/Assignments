package basicJava;

public class StaticVariable {

	public static String classVariable = "myClassVariable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//All three will display "myClassVariable"
		StaticVariable java = new StaticVariable();
		StaticVariable java1 = new StaticVariable();
		StaticVariable java2 = new StaticVariable();

		System.out.println(java.classVariable);
		System.out.println(java1.classVariable);
		System.out.println(java2.classVariable);
		
		//changing the value of static variable using java1

		java1.classVariable = "changedText";
		
		System.out.println(java.classVariable);
		System.out.println(java1.classVariable);
		System.out.println(java2.classVariable);
		
		//All three will display "changedText"
		
		
	}

}
