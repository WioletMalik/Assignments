package constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREATING A REFERENCE VARIABLE OF PERSON CLASS, using default constructor
		//and class level variable gets inti with default values 
		// for person class the default values are null,null,0
		
		 Person p1 = new Person();
		 
		 // Creating a reference variable of Person class using parameterized constructor
		 // class variable gets init with values provide to the constructors are wiolet,1stoct87, 1234
		 
		 Person p2 = new Person("wiolet","1stoct87",1234);
		 
		 System.out.println("name"+ p1.name+"dob"+p1.dob+"sin"+p1.sin );
		 System.out.println("name"+ p2.name+"dob"+p2.dob+"sin"+p2.sin );
		 
		 Car c= new Car();
		 
		 String s = new String("bmw");
		 
		 Employee e = new Employee(101);
		 
		 
		 
		 
		 
		 
	}

}
