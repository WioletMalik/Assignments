package exceptionHandling;

import java.util.Scanner;

public class TestException {

	File file = new file(":\\message1.text");
	
	try {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	}catch(FileNotFoundException) {
		e.printStackTrace();
		System.out.println("File not found at specified location");
	}
}
