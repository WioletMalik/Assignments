package revisionOfJavaPrograms;

public class CalculateTheAverageMarks {

	public static void main(String[] args) {

		int Maths = 75;
		int Science = 55;
		int OperatingSystems = 80;
		int DatawareHouse = 75;

		int marksAverage = (Maths + Science + OperatingSystems + DatawareHouse / 4);
		System.out.println("Average Marks:" + marksAverage);

	}

}
