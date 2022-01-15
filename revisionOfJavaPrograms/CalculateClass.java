package revisionOfJavaPrograms;

public class CalculateClass {

	double foodCost;
	double distance;
	double deliveryFee;
	double tip;
	double additionalDeliveryFee;
	double costOfFood;
	double tax;
	double finalCost;

	public CalculateClass(double costOfFood, double deliveryDistance) {
		this.foodCost = costOfFood;
		this.distance = deliveryDistance;

	}

	public void foodCost() {
		if (distance > 20) {
			foodCost = foodCost + additionlDeliveryFee() + tip();
		}
		if (foodCost > 100 && distance <= 20) {
			deliveryFee = 0;
			foodCost = foodCost + deliveryFee + tip();
		} else if (foodCost >= 50 && foodCost <= 100 && distance <= 10) {
			deliveryFee = foodCost * 0.05;
			foodCost = foodCost + deliveryFee + tip();
		} else if (foodCost < 50 && distance < 5) {
			deliveryFee = foodCost * 0.1;
			foodCost = foodCost + deliveryFee + tip();
		}

	}

	public double additionlDeliveryFee() {
		if (distance > 20) {
			double condition1 = foodCost * 0.02;
			double condition2 = (distance - 20) * 2;
			if (condition1 < condition2) {
				deliveryFee = condition1;
			} else {
				deliveryFee = condition2;
			}
		}
		return additionalDeliveryFee;

	}

	public double tip() {
		if (foodCost < 40) {
			tip = foodCost * 0.02;
		}
		return tip;
	}

	public double taxCalculation(double C_foodcost) {
		tax = (C_foodcost * 13) / 100;
		System.out.println("Tax amount is :" + tax);
		return tax;
	}

	public double finalFoodCost(double beforeTax) {
		finalCost = beforeTax + tax;
		System.out.println("The Final Food Cost :" + finalCost);

		return finalCost;
	}

	public double costOfFood() {
		foodCost();
		costOfFood = foodCost + additionlDeliveryFee();
		return costOfFood;
	}
}