package inheritence;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount checkin = new ChequingAccount();
		checkin.balance = 100;
		checkin.displayBalance();
		checkin.intrest();

		SavingsAccount savings = new SavingsAccount();

		savings.accountNumber = 2345678;
		savings.displayBalance();

		TSFA tsfa = new TSFA();
		tsfa.balance = 100;
		tsfa.intrest();

	}

}
