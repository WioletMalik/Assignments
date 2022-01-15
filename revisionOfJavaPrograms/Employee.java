package revisionOfJavaPrograms;

public class Employee {

	String name;
	int yearOfJoining;
	double salary;
	String address;

	public Employee(String name, int yearOfJoining, double salary, String address) {

		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}

	public void employeeInformation() {

		System.out.println(name + " " + yearOfJoining + " " + salary + " " + address);
	}
}
