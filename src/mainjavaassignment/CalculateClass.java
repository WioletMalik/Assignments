package mainjavaassignment;

public class CalculateClass {

	double foodCost;
	double distance;
	double deliveryCost;
	double baseCost;
	double tip;
	double tax;
	double completeCost;
	String theCoupon;
	double discount;
	double costAfterDiscount;
	double cashPayment;
	double cardPayment;

	public CalculateClass(double foodCost, double distance, String theCoupon, double cashPayment, double cardPayment) {
		this.foodCost = foodCost;
		this.distance = distance;
		this.theCoupon = theCoupon;
		

	}

	Coupon coupon_1 = new Coupon();

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

	public double tip() {
		if (foodCost > 40) {
			tip = foodCost * 0.02;
			System.out.println("Tip amount:" + tip);

		}
		return tip;
	}

	public double taxCalculation(double costAfterDiscount) {

		tax = costAfterDiscount * 0.13;

		System.out.println("Tax on Food:" + tax);
		return tax;
	}

	public double calculateDiscountedCost() {
		costAfterDiscount = coupon_1.costAfterDiscount(baseCost, theCoupon);
		return costAfterDiscount;
	}

	public double completeCost(double costAfterDiscount) {
		completeCost = costAfterDiscount + taxCalculation(costAfterDiscount) + tip();
		return completeCost;
	}

}