package basicJava;

public class LocalVariable {

	// instance variable
	public String myVar = "myInstanceVariable";

	public static void myMethod(String[] args) {
		// TODO Auto-generated method stub

		// local variable

		String myVar = "myLocalVariable";
		System.out.println(myVar);

	}

	public static void main(String[] args) {
		// Creating object

		LocalVariable obj = new LocalVariable();

		/*
		 * We are calling the method, that changes the value of myVar. We are displaying
		 * myVar again after the method call, to demonstrate that the local variable
		 * scope is limited to the method itself.
		 */
		System.out.println("Calling Method");
		obj.myMethod(args);
		System.out.println(obj.myVar);
	}
}
