package mainjavaassignment;

import java.util.Scanner;

import finalJavaPractical.CallingMethodInSameClass;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Food Cost");
		double foodCost = scan.nextDouble();
		System.out.println("Enter Delivery distance");
		double distance = scan.nextDouble();
		System.out.println("Enter the coupon");
		String thecoupon = scan.next();

		CalculateClass calc = new CalculateClass(foodCost, distance, thecoupon);
		double baseCost = calc.baseCost();

		System.out.println("Subtotal:" + baseCost);

		System.out.println("Complete cost:" + calc.completeCost(baseCost));

		// CallingMethodInSameClass call = new CallingMethodInSameClass();

		// int sum = call.Three();

		// System.out.println("third Method :" + sum);

		System.out.println("Enter payment mode cashPayment or cardPayment");
		double cash = scan.nextDouble();
		double cashPayment = cash;
		System.out.println("Cash Payment");

		System.out.println("2.Card Payment");

		int pay = scan.nextInt();

		PaymentCalculation payment = new PaymentCalculation();
		if (pay == 1) {
			payment.cardPayment();
		} else if (pay == 2) {
			payment.cardPayment();
		} else {
			System.out.println("Invalid Option");
		}
		System.out.println("Enter the cash paid");

		int cardPayment = scan.nextInt();

		System.out.println("last 4 digits of the card and a pin number");

		PaymentCalculation payment = new PaymentCalculation(cashPayment, cardPayment);

		double balance = payment.cashPayment();

		System.out.println("Cash Paid:" + cashPayment);
		System.out.println("Balance:" + balance);

	}

}
