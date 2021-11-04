package smallPrograms;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first numbers");
		int number1 = input.nextInt();
		
		System.out.println("Enter second numbers");
		int number2 = input.nextInt();
		
		System.out.println("Sum :"+(number1+number2));
		
		do(){
			System.out.println("Enter 1 to perform the operation again");
			int yes=input.nextInt();
			System.out.println("Sum :"+(number1+number2));
		}
		while() {
			System.out.println("Terminate");
			
			
		}
	}

}
