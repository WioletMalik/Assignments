package revisionOfJavaPrograms;

import java.util.Scanner;

public class EmployeesMain {

	public static void main(String[] args) {

		String empname;
		double hours;
		double pay;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();
		Employees emp1 = new Employees(empname, hours, pay);

		System.out.println("Please enter second employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();
		Employees emp2 = new Employees(empname, hours, pay);

		System.out.println("Please enter third employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();

		Employees emp3 = new Employees(empname, hours, pay);

		System.out.println("Gross Pay of " + emp1.name + " = " + emp1.grossPay());
		System.out.println("Gross Pay of " + emp2.name + " = " + emp2.grossPay());
		System.out.println("Gross Pay of " + emp3.name + " = " + emp3.grossPay());
		scan.close();
	}

}
