package basicJava;

public class AirthmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Basic Arithmetic Operators
		// Basic arithmetic operators are: +, -, *, /, %
		int num1 = 200;
		int num2 = 100;

		System.out.println("num1+num2:" + (num1 + num2));
		System.out.println("num2-num1:" + (num1 - num2));
		System.out.println("num1*num2:" + (num1 * num2));
		System.out.println("num1/num2:" + (num1 / num2));
		System.out.println("num1%num2:" + (num1 % num2));

		// Assignment Operators
		// Assignments operators in java are: =, +=, -=, *=, /=, %=

		int figure1 = 10;
		int figure2 = 20;

		figure1 = figure2;
		System.out.println("=Output:" + figure2);

		figure1 += figure2;
		System.out.println("+=Output:" + figure2);

		figure1 -= figure2;
		System.out.println("-=Output:" + figure2);

		figure1 *= figure2;
		System.out.println("*=Output:" + figure2);

		figure1 /= figure2;
		System.out.println("/=Output:" + figure2);

		figure1 %= figure2;
		System.out.println("%=Output:" + figure2);

		// Auto-increment and Auto-decrement Operators

		int digit1 = 100;
		int digit2 = 200;
		digit1++;
		digit2--;
		System.out.println("digit1++ is :" + digit1);
		System.out.println("digit2-- is:" + digit2);

		// Logical operators in java are: &&, ||, !

		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1&&b2:" + (b1 && b2));
		System.out.println("b1||b2:" + (b1 || b2));
		System.out.println("!(b1&&b2):" + !(b1 && b2));

		// We have six relational operators in Java: ==, !=, >, <, >=, <=

		
	}
}
