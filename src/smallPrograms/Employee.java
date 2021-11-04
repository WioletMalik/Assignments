package smallPrograms;

public class Employee {

	String employeeName;
	int hoursWorked;
	double hourlyRates;
	double grossPay;
	double overTime;

	public Employee(String employeeName, int hoursWorked, double hourlyRates) {
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
		this.hourlyRates = hourlyRates;

	}

	public double grossPay() {
		if (hoursWorked <= 40) {
			grossPay = hoursWorked * hourlyRates;
		} else if (hoursWorked > 40 && hoursWorked <= 60) {
			overTime = (hoursWorked - 40);
			grossPay = hoursWorked * hourlyRates + (overTime * (1.5 * hourlyRates));
		} else {
			System.out.println("Working hours exceeded Maximim limit");
		}

		return grossPay;

	}
}