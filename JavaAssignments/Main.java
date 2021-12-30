package JavaAssignments;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		
		System.out.println("Enter second number");
		int b = input.nextInt();
		
		System.out.println("Enter third number");
		int c = input.nextInt();
		
		System.out.println("The Avg of three numbers is:"+ (a+b+c)/3);
		
		
		
	}

}
