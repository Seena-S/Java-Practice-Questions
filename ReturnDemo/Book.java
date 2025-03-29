package seena.corejavaprograms.ReturnDemo;
//How to return an object from a method
public class Book {
	String name;
	String author;
	double price;
	
	Book(String n, String a, Double p){
		name=n;
		author=a;
		price=p;
	}
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}

}
