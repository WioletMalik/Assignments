package accessModifiers;

public class Employee {

	 public String name ;
	 public String email ;
	 private double salary;
	 private int emp_id;
	 String designation;
	 
	 
	public double getSalary(String designation, int emp_id ) {
		
		return salary;
	}
	public void setSalary() {
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	  
	  
}
