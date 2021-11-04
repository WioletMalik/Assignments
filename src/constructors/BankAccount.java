package constructors;

public class BankAccount {

	String name;
	int accountNumber;
	int pin;
	double balance;
	double showBalance;
    double checkinAccountBalance;
    double savingAccountBalance;
    
	public BankAccount() {

	}

	public BankAccount(String n, int ac, int p) {

		name = n;
		accountNumber = ac;
		pin = p;
	}

	// create a method to deposit money in my account

	public void depositMoney(double bb) {
		balance = bb;

	}

	public double showBalance() {

		return balance;

	}	

	public double withdrawMoney(double amount) {
		balance = balance - amount;
		return amount;

	}
	
	
}
