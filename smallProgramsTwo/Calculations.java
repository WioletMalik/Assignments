package smallProgramsTwo;
public class Calculations implements Process {
	int job = 2;
	int income = 40000;
	int installment;
	double basePrice;
	double intrestRate;
	double finalCarCost;
	
	Calculations(double basePrice, int yearsOfInstallment) {
		this.basePrice = basePrice;
		this.installment = yearsOfInstallment;
	}
	public boolean isEligible() {
		if (job >= 2 && income >= 40000) {
			return true;
		} else {
			return false;
		}
	}
	public double calculateInterest() {

		if (installment == 7) {
			intrestRate = basePrice * 4 / 100;
			System.out.println("intrest rate is:" + intrestRate);
		} else if (installment == 5) {
			intrestRate = basePrice * 3 / 100;
			System.out.println("intrest rate is:" + intrestRate);
		} else if (installment == 3) {
			intrestRate = basePrice * 2 / 100;
			System.out.println("intrest rate is:" + intrestRate);
		} else {
			System.out.println("No other installment plan availble");
		}
		return intrestRate;
	}
	public double carCost() {
		if (isEligible() == true) {
			finalCarCost = basePrice + calculateInterest();
		} else {
			System.out.println("you are not eligible");
		}

		return finalCarCost;

	}

}
