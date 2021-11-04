package JavaAssignments;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 =new Employee();
		
		Employee emp1 = new Employee("Robert",1994,40000,"64C-wallstreet");
		
		
		employee1.name = "Robert";
		employee1.yearOfJoining = 1994;
		employee1.salary= 40000;
		employee1.address ="64C WallsStreet";
		
		Employee employee2 =new Employee();
		
		Employee emp2 = new Employee("Sam",2000,50000,"68D-wallstreet");
		
		employee2.name = "Sam";
		employee2.yearOfJoining = 2000;
		employee2.salary= 50000;
		employee2.address ="68D WallsStreet";
		
		Employee employee3 =new Employee();
		
		Employee emp3 = new Employee("John",1999,73000,"26B-wallstreet");
		
		employee3.name = "John";
		employee3.yearOfJoining = 1999;
		employee3.salary= 73000;
		employee3.address ="26b WallsStreet";
		
		
		System.out.println("Name"+"YearOfJoining"+"Address"+"Salary");
		
System.out.println(employee1.name+" "+employee1.yearOfJoining+" "+employee1.address+" "+employee1.salary);
System.out.println(employee2.name+" "+employee2.yearOfJoining+" "+employee2.address+" "+employee2.salary);
System.out.println(employee3.name+" "+employee3.yearOfJoining+" "+employee3.address+" "+employee3.salary);


		
				
		
	}

}
