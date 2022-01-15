package revisionOfJavaPrograms;

public class Coupon {

	boolean couponApply=true;
	
	public double calulateCoupon(int Coupon, double foodCost, double deliveryFee) {
		if (Coupon == 1) {
			foodCost = foodCost - (foodCost * 0.05);
		} else if (Coupon == 2) {
			foodCost = foodCost - (foodCost * 0.1);
		} else if (Coupon == 3) {
			foodCost = foodCost - 10;
		} else if (Coupon == 4) {
			foodCost = foodCost - deliveryFee;
		}
		return foodCost;
	}
	
}
