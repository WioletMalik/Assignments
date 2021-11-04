package smallPrograms;

public class CalculateWeeklySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int $perHourRate = 14;
		int workingHrsPerDay = 8;
		int workingDaysInWeek = 5;
		double weeklySalary = 560.00;
		double percantageOftaxOnWeeklySalary = 0.10;
		double taxOnWeeklySalary = 56.00;

		System.out.println("Weekly Salary is:" + $perHourRate * workingHrsPerDay * workingDaysInWeek);
		System.out.println("Tax on weekly salary is:" + (weeklySalary * percantageOftaxOnWeeklySalary));
		System.out.println("Take home weekly salary is:" + (weeklySalary - taxOnWeeklySalary));
	}

}
