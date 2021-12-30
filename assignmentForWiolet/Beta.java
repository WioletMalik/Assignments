package assignmentForWiolet;

public class Beta extends Alpha {

	public Beta() {
		System.out.print("beta ");
	}

	void go() {
		type = "b ";
		System.out.print(this.type + super.type);
	}
}
