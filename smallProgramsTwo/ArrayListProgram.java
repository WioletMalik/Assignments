package smallProgramsTwo;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");

		System.out.println("Collection of colors:" + colors);

		if (colors.contains("Navy")) {
			System.out.println("Blue Color found");
		} else {
			System.out.println("Color Not found");
		}
	}

}
