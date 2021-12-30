package accessModifiers;

public class BankApplication {

	public static void main(String[] args) {
		BankVariables bankVariables=new BankVariables();
		
		bankVariables.setSin(1236545);
        bankVariables.getSin();
        System.out.println(bankVariables.getSin());
	}

}
