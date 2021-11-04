package abstraction;

public class SBIClass extends RBIClass implements GovtRules, SBIInhouseRules {

	double balance;

	public SBIClass(double balance) {
		this.balance = balance;
	}

	@Override
	public double calculateIntrest() {
		intrest = balance * 0.03;
		return intrest;
	}

	@Override
	public double calculateBalance() {
		balance = balance + intrest;
		return balance;
	}

	@Override
	public void lendMoney() {
		// TODO Auto-generated method stub
		System.out.println("lendMoney");
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("depositMoney");
	}

	@Override
	public void issueCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("issueCreditCard");
	}

	@Override
	public void newCustomerDeposit() {
		// TODO Auto-generated method stub
		System.out.println("New Customer Bonus");

	}

}
