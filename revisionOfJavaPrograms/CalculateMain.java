package revisionOfJavaPrograms;

import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Food Cost");
		double costOfFood = scan.nextDouble();
		System.out.println("Enter deliver distance");
		double deliveryDistance = scan.nextDouble();
		System.out.println("select coupon from below option");

		System.out.println("1.Coupon5");
		System.out.println("2.Coupon10");
		System.out.println("3.Coupon$10");
		System.out.println("4.FreeDel");
		System.out.println("5.None");
		CalculateClass calculateClass = new CalculateClass(costOfFood, deliveryDistance);
		Coupon cou = new Coupon();

		double baseCost = calculateClass.costOfFood();
		int coupon = scan.nextInt();

		double foodCostAfterCoupon = cou.calulateCoupon(coupon, baseCost, calculateClass.costOfFood());
		System.out.println("After coupon  " + foodCostAfterCoupon);

		System.out.println("Food Cost without tax: " + calculateClass.costOfFood());

		calculateClass.taxCalculation(foodCostAfterCoupon);

		System.out.println("Tip  :" + calculateClass.tip());

		calculateClass.finalFoodCost(foodCostAfterCoupon);

		System.out.println("******Payment*******");
		System.out.println("******PAYMENT*******");
		System.out.println("SELECT THE PAYMENT METHOD");
		System.out.println("1.Via  Cash");
		System.out.println("2.Via Card");
		int pay = scan.nextInt();

		PaymentClass paymentClass = new PaymentClass();

		paymentClass.getValue(pay, payAmount);
		if (pay == 1) {

			paymentClass.paymentViaCash();

		} else if (pay == 2) {
			paymentClass.paymentViaCard();

		} else {

			if (pay == 1) {
				System.out.println("Enter the amount recived");
				double paidAmount = scan.nextDouble();
				paymentClass.paymentViaCash(payAmount, paidAmount);
			} else if (pay == 2) {
				System.out.println("Please enter  16 digits of the card");
				String cardNo = scan.next();
				System.out.println("Please enter 4 digit PIN  ");
				int pin = scan.nextInt();
				paymentClass.paymentViaCard(cardNo, pin);
			} else {
				System.out.println("Wrong payment selection");
			}
			scan.close();

		}

	}
}