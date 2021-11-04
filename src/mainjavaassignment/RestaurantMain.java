package mainjavaassignment;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Food Cost");
		double foodCost = scan.nextDouble();
		System.out.println("Enter Delivery distance");
		double distance = scan.nextDouble();

		CalculateClass calc = new CalculateClass(foodCost, distance);
		double baseCost = calc.baseCost();
		System.out.println("Subtotal:" + baseCost);

		System.out.println("Enter the coupon");
		String thecoupon = scan.next();
		scan.close();

		Coupon coupon = new Coupon(thecoupon);
		double afterDiscount = coupon.costAfterDiscount(baseCost);
		System.out.println("costAfterDiscount:" + afterDiscount);
		double completeCost = calc.completeCost(afterDiscount);
		System.out.println("Complete cost:" + completeCost);

	}

}
