package finalJavaPractical;

public class CallingMethodInSameClass {

	public int One() {
		int a = 10;
		return a;
	}

	public int Two() {
		int b = 10;
		return b;
	}

	public int Three() {
		One();
		Two();
		int sum = One() + Two();
		return sum;

	}
}
