package Classes;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		// Book book2 = new Book();
		// Book book3 = new Book();

		book1.author = "JK Rowlings";
		book1.title = "Harry Potter & sorcerer’s stone";
		book1.pageCount = 350;

		// book2.author = "Anne Frank";
		// book2.title = "Diary of Anne Frank";
		// book2.pageCount = 300;

		// book3.author = "Charles Dickens";
		// book3.title = "Christmas carols";
		// book3.pageCount = 200;

		// System.out.println("The Title " + book1.title);

		// System.out.println("After set to book1.setTitle(); " + book1.title);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter new title");
		String newTitle = input.next();
		book1.setTitle(newTitle);

		System.out.println("New Title:" + book1.title);
	}

}
