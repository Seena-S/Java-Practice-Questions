package seena.corejavaprograms.ReturnDemo;

import java.util.Scanner;

public class BookCreator {
	
   Book createNewBook() {
	   
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of the book");
		String n=sc.next();
		System.out.println("Enter the name of the author");
		String a=sc.next();
		System.out.println("Enter the price of the book");
		Double p=sc.nextDouble();
		
		return new Book(n,a,p);
	}

}
