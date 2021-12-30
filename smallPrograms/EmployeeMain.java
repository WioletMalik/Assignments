package smallPrograms;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee("jane", 40, 45.50);
		Employee employee2 = new Employee("josh", 55, 50.50);
		Employee employee3 = new Employee("noah", 39, 55.50);

		System.out.println("Gross pay of first employee is " + employee1.grossPay());
		System.out.println("Gross pay of second employee is " + employee2.grossPay());
		System.out.println("Gross pay of third employee is " + employee3.grossPay());
	}

}
