package basicJava;

public class InstanceVariable {

	// instance variable

	String objectVariable = "myInstanceVariable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariable ins1 = new InstanceVariable();

		InstanceVariable ins2 = new InstanceVariable();

		System.out.println(ins1.objectVariable);
		System.out.println(ins2.objectVariable);

		// change value to object ins1

		ins1.objectVariable = "newInstanceVariable";

		System.out.println(ins1.objectVariable);
		
		

	}

}
