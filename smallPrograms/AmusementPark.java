package smallPrograms;

public class AmusementPark {

	double height;
	double weight;
	AmusementPark[] amusement;

	public AmusementPark(double height, double weight) {
		this.height = height;
		this.weight = height;
	}

	public void eligibility(double height, double weight) {
		if (height >= 90 && height <= 200 && weight >= 15 && weight <= 95) {
			System.out.println("you are  allowed on rides ");
		} else {
			System.out.println("you are not allowed on rides ");
		}
	}
}
