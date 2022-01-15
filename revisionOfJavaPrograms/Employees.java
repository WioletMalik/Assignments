package revisionOfJavaPrograms;

public class Employees {

	String name;
	double noOfHoursWorked;
	double hourleyRate;
	double grossPay;
	double overTime;

	public Employees(String name, double noOfHoursWorked, double hourleyRate) {
		this.name = name;
		this.noOfHoursWorked = noOfHoursWorked;
		this.hourleyRate = hourleyRate;
	}

	public double grossPay() {
		if (noOfHoursWorked < 40) {
			grossPay = noOfHoursWorked * hourleyRate;
		} else if (noOfHoursWorked <= 60) {
			overTime = (noOfHoursWorked - 40) * 1.5 * hourleyRate;
			grossPay = overTime + (hourleyRate * 40);
		} else {
			System.out.println("over time is exceed " + name);
		}

		return grossPay;
	}
}
