package mainjavaassignment;

public class PaymentCalculation implements PaymentMode {

	double cashPayment;
	double cardPayment;
	double foodCost;
	double distance;
	String theCoupon;
	double costAfterDiscount;

	

	CalculateClass calculate = new CalculateClass(foodCost, distance, theCoupon);

	@Override
	public void cashPayment() {
		// TODO Auto-generated method stub
		double balance = cashPayment - calculate.completeCost(costAfterDiscount);
		System.out.println("Cash Paid:" + cashPayment);
		System.out.println("Balance :" + balance);
	}

	@Override
	public  void cardPayment() {
		// TODO Auto-generated method stub

		
	}

}
