package arryList;

import java.util.HashMap;

public class HaspMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> studentsNames = new HashMap<>();

		studentsNames.put(1, "Manvir");
		studentsNames.put(2, "Ketki");
		studentsNames.put(3, "Wiolet");
		studentsNames.put(4, "Gurmeen");
		studentsNames.put(5, "Jijo");

		studentsNames.get(1);
		studentsNames.remove(3);

		for (String individualNames : studentsNames.values()) {
			System.out.println(individualNames);
		}

		for (Integer individualNames : studentsNames.keySet()) {
			System.out.println(individualNames);

		}

	}

}
