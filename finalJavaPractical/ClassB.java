package finalJavaPractical;

public class ClassB {

	int numberOne;
	int numbertwo;
	

	public ClassB(int firstNumber, int secondNumber) {

		this.numberOne = firstNumber;
		this.numbertwo = secondNumber;

	}
	

	ClassC call = new ClassC();

	int sum = call.addTwoNumbers(numbertwo, numberOne);

}
