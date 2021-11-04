package constructors;

public class Banquet {

	double bookingCost;
	double baseCost;
	double foodCost;
	double beveragesCost;
	double taxOnFood;
	double taxOnBeverages;
	double tip;
	double valueOfTax;
	double serviceCess;
	int guests;
	double totalCost;

	// calculating base cost
	public double calculateBaseCost(double base, double food, double bevCost, double tp) {

		foodCost = food;
		beveragesCost = bevCost;
		tip = tp;
		baseCost = base;

		bookingCost = base + food + bevCost + tp;
		return bookingCost;

	}

	// calculate tax
	public double calculatetax(double bookingCost) {

		valueOfTax = bookingCost * 0.13;

		return valueOfTax;
	}

	// calculate serviceCess

	public double calculateCess(int guest, double bookingCost) {

		guests = guest;

		if (guests <= 40) {
			serviceCess = baseCost * 0.04;
		} else if (guests > 40 & guests <= 80) {
			serviceCess = baseCost * 0.08;
		} else if (guests > 80 & guests <= 150) {
			serviceCess = baseCost * 0.10;
		} else if (guests > 150) {
			serviceCess = baseCost * 0.12;
		} else {
			System.out.println("invalid");
		}

		return serviceCess;
	}

	//
	public double calculateTheTotalCost(double bookingCost, double valueOfTax, double serviceCess) {

		totalCost = bookingCost + valueOfTax + serviceCess;
		return totalCost;

	}
}
