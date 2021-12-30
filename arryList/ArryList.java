package arryList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listOfFruits = new ArrayList<>();

		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Strawberry");
		listOfFruits.add("Grapes");

		for (String individualName : listOfFruits) {
			System.out.println(individualName);
		}

		listOfFruits.size();

		System.out.println(listOfFruits);

		listOfFruits.get(0);

		listOfFruits.remove("Mango");
		listOfFruits.remove(3);

		for (String individualName : listOfFruits) {
			System.out.println(individualName);

		}

		listOfFruits.clear();

	}

}
