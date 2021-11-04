package inheritence;

public class ChequingAccount {

	public double balance;

	public ChequingAccount() {

	}

	public ChequingAccount(double balance) {
		super();
		this.balance = balance;

	}

	public void displayBalance() {
		System.out.println("Balance" + balance);
	}

	public void intrest() {

		double intrest = 0.1;
		this.balance = balance + (balance * intrest);
		System.out.println("balance after intrest " + balance);

		
	}
}
