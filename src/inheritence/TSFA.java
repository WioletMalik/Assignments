package inheritence;

public class TSFA extends ChequingAccount {

	@Override
	public void intrest() {

		double intrest = 2.00;
		this.balance = balance+ (balance * intrest);
		System.out.println("balance after intrest " + balance);

	}
}
