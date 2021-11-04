package constructors;

import java.util.Scanner;

public class MainBanquet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inputs from user for booking cost

		Scanner sc = new Scanner(System.in);

		Banquet banq = new Banquet();

		System.out.println("Enter deposit amount");

		double base = sc.nextDouble();

		System.out.println("Enter the food cost");

		double food = sc.nextDouble();

		System.out.println("Enter the beverages cost");

		double bevCost = sc.nextDouble();

		System.out.println("Enter the tip");

		double tp = sc.nextDouble();

		// double bookingCost = banq.calculateBaseCost(base,food,bevCost,tp);

		double bookingCost = banq.calculateTheTotalCost(food, bevCost, tp);

		System.out.println("bookingCost = " + bookingCost);

		// calculating tax

		double valueOfTax = banq.calculatetax(bookingCost);

		// calculating serviceCess

		System.out.println("Enter the number of guest");

		int guest = sc.nextInt();

		double serviceCess = banq.calculateCess(guest, bookingCost);

		// calculate totalCost

		double totalCost = banq.calculateTheTotalCost(bookingCost, valueOfTax, serviceCess);

		System.out.println("totalCost=" + totalCost);

		sc.close();
	}

}
