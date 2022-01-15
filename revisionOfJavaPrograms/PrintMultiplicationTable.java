package revisionOfJavaPrograms;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num = scan.nextInt();
		scan.close();

		int x = 1;	
		int multipication = 0;
		while (x <= 10) {
			multipication = num * x;
			System.out.println(num + "x" + x + "=" + multipication);
			x++;
		}
	
	}

}
