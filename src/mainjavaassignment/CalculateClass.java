package mainjavaassignment;

public class CalculateClass {

	double foodCost;
	double distance;
	double deliveryCost;
	double baseCost;
	double tip;
	double tax;
	double completeCost;

	public CalculateClass() {

	}

	public CalculateClass(double foodCost, double distance) {
		this.foodCost = foodCost;
		this.distance = distance;

	}

	public void deliveryCost() {
		if (foodCost > 100 && distance <= 20) {
			deliveryCost = 0;
		} else if (foodCost > 50 && foodCost < 100 && distance <= 10) {
			deliveryCost = foodCost * 0.05;
		} else if (foodCost < 50 && distance <= 5) {
			deliveryCost = foodCost * 0.1;
		} else if (distance > 20) {
			double condition1 = foodCost * 0.02;
			double condition2 = (distance - 20) * 2;
			if (condition1 < condition2) {
				deliveryCost = condition1;
			} else {
				deliveryCost = condition2;
			}
		}

	}

	public double baseCost() {
		deliveryCost();
		baseCost = foodCost + deliveryCost;

		return baseCost;
	}

	public void tip() {
		if (foodCost > 40) {
			tip = foodCost * 0.02;
			System.out.println("Tip amount:" + tip);
		}
	}

	public void taxCalculation(double costAfterDiscount) {
		tax = costAfterDiscount * 0.13;
		System.out.println("Tax on Food:" + tax);
	}

	public double completeCost(double costAfterDiscount) {
		taxCalculation(costAfterDiscount);
		tip();
		completeCost = costAfterDiscount + tax + tip;
		return completeCost;
	}
}