package constructors;

import java.util.Scanner;

public class Mainaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount m1 = new BankAccount();

		BankAccount m2 = new BankAccount("wiolet", 987654, 123);

		m2.depositMoney(5000);

		System.out.println(m2.showBalance());

		// access a value of a variable

		// withdraw the money

		double amountWithdrawn = m2.withdrawMoney(2000);

		System.out.println("amountWithdrawn " + amountWithdrawn);

		double showBalance = m2.showBalance();

		System.out.println("showBalance" + showBalance);

		Scanner sc = new Scanner(System.in);

		System.out.println("In which account do you want to deposit");

		System.out.println("Enter 1 for checkin and Enter 2 for saving");

		int option = sc.nextInt();

		if (option == 1) {
			System.out.println("Enter the amount to deposit");
			double amount = sc.nextDouble();
			m2.checkinAccountBalance = amount;
		} else if (option == 2) {
			System.out.println("Enter the amount to deposit");
			double amount = sc.nextDouble();
			m2.savingAccountBalance = amount;
		} else {
			System.out.println("Invalid option");
		}

	}

}
