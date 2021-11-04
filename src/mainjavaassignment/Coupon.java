package mainjavaassignment;

public class Coupon {

	double foodCost;
	double deliveryCost;
	double costAfterDiscount;
	String Coupon;
	double baseCost;

	public Coupon() {
	}

	public Coupon(String coupon) {
		this.Coupon = coupon;
	}

	public double costAfterDiscount(double baseCost) {

		if (Coupon.equalsIgnoreCase("Coupon5")) {
			costAfterDiscount = (baseCost - (baseCost * 0.05));
		} else if (Coupon.equalsIgnoreCase("Coupon10")) {
			costAfterDiscount = (baseCost - (baseCost * 0.10));
		} else if (Coupon.equalsIgnoreCase("Coupon$10")) {
			costAfterDiscount = (baseCost - 10);
		} else if (Coupon.equalsIgnoreCase("FreeDel")) {
			costAfterDiscount = baseCost - deliveryCost;
		} else if (Coupon.equalsIgnoreCase("none")) {
			costAfterDiscount = baseCost;
		}
		return costAfterDiscount;

	}

}
