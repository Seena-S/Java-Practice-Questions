package seena.corejavaprograms.ReturnDemo;

public class BookTester {

	public static void main(String[] args) {
		BookCreator b1= new BookCreator();
		Book b2=b1.createNewBook();
		b2.display();

	}

}
