package smallPrograms;

import java.util.Scanner;

public class PrintMultiplicationTableWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Positive number");
		int num = input.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println("num:" + (num * i));
			i++;
		}
	}

}
