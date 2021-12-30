package smallProgramsTwo;

public class AmusementParkRide {

	int height;
	int weight;

	AmusementParkRide(int minimumHeight, int maximumWeight) {
		this.height = minimumHeight;
		this.weight = maximumWeight;

	}

	public void measureHeightWeight() {
		if (height < 90 && weight < 15) {
			System.out.println("You are not allowed on ride");
		} else if (height > 200 && weight > 95) {
			System.out.println("You are not allowed on ride");
		} else {
			System.out.println("You are allowed on ride");
		}
	}

}
