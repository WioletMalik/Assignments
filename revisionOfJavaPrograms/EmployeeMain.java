package revisionOfJavaPrograms;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("Wiolet", 2021, 5000.55, "Brampton");
		// empOne.employeeInformation("Wiolet", 2021, 5000.55, "Brampton");
		System.out.println("Details for first employee:" + empOne);

		Employee empTwo = new Employee("Jijo", 2022, 6000.00, "NewYork");
		// empTwo.employeeInformation("Jijo", 2022, 6000.00, "NewYork");

		empOne.employeeInformation();
	}

}
