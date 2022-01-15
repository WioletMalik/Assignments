package revisionOfJavaPrograms;

import java.util.HashMap;
import java.util.Scanner;


public class PaymentClass extends CalculateMain implements Payment {
	int option;
	double payAmount, paidAmount;
	int pin, enterPin;
	boolean mapValue;
	String cardNo;

	Scanner input = new Scanner(System.in);

	public void getValue(int pay_option, double Pay_Amount) {
		option = pay_option;
		payAmount = Pay_Amount;

	}

	public void getPin(int enter_Pin) {
		enterPin = enter_Pin;
	}

	@Override
	public void paymentViaCash(double payAmount, double paidAmount) {
		System.out.println("Enter the amount recived");
		paidAmount = input.nextDouble();
		paidAmount = paidAmount - payAmount;
		System.out.println("Total Food Cost is " + payAmount);
		System.out.println("pay the balance amount" + paidAmount);

	}

	public void cardDetails() {

		System.out.println("Pay the balance amount" + paidAmount);
	}

	@Override
	
	public void paymentViaCard(String cardNo, int pin) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		hMap.put("1122334455667788", 1111);
		hMap.put("8877665544332211", 2222);
		hMap.put("1234567899876543", 3333);

		hMap.put("4569787987122129", 2901);
		hMap.put("9659851236597864", 2014);

		System.out.println("Please enter  16 digits of the card");
		cardNo = input.next();
		mapValue = hMap.containsKey(cardNo);
		if (mapValue == true) {
			pin = hMap.get(cardNo);
			System.out.println("Enter the PIN");
			enterPin = input.nextInt();
			enterPin = pin;
			if (pin == enterPin) {
				// paidAmount = payAmount - payAmount;
				System.out.println("Thanks for purchase");
			} else {
				System.out.println("Wrong PIN Transaction declined");
			}

		}

		else {
			System.out.println("Invalid Card Number");
		}

	}

}
