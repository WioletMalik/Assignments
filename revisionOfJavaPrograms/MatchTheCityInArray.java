package revisionOfJavaPrograms;

import java.util.Scanner;

public class MatchTheCityInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter city name");
		String city = scan.next();
		scan.close();

		String[] cities = { "Brampton", "New York", "Toronto", "London" };

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].contains(city)) {
				System.out.println("city name listed");
			} else {
				System.out.println("city name not listed");
			}

		}
	}
}
