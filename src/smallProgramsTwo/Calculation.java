package smallProgramsTwo;

public class Calculation {

	int a;
	int b;
	int c;

	Calculation(int A, int B, int C) {
		this.a = A;
		this.b = B;
		this.c = C;

	}

	void sum() {
		System.out.println("sum of three numbers:" + (a + b + c));
	}
}
