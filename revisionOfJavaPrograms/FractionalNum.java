package revisionOfJavaPrograms;

public class FractionalNum {

	public static void main(String[] args) {

		int num = 10;

		long fractionalNum = 1;

		for (int i = 1; i <= num; i++) {
			fractionalNum = fractionalNum * i;
		}
		System.out.println(fractionalNum);
	}

}
