package constructors;

public class Person {
 // declaretion
	// constructors should have same name as class
	// constructors do not give any value back
	  String name;
	  String dob;
	  int sin;
	  // constructors are used to intilise class level variables = putting in the vales in the variables
	  //this is default constructors, they do not have any args
	  
	  public Person() {
		  
	  }
	  // this is a parametrised constructor
	  public Person(String n, String birthdate , int s) {
		  
		  name = n;
		  dob = birthdate;
		  sin = s;
	  }
}
