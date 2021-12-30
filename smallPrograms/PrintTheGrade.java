package smallPrograms;

import java.util.Scanner;

public class PrintTheGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double percentage;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the percentage");
		percentage = input.nextDouble();
        input.close();
        
        if(percentage<50) {
        	System.out.println("Grade : D");
        }
        else if(percentage>50 && percentage<60) {
        	System.out.println("Grade : C");
        }
        else if(percentage>60 && percentage<75) {
        	System.out.println("Grade : B");
        }
        else if(percentage<75) {
        	System.out.println("Grade : A");
        }
        
        
	}

}
