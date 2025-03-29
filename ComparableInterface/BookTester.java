package ComparableInterface;

import java.util.Arrays;

public class BookTester {

	public static void main(String[] args) {
		
		Book[]arr= {new Book("java",789),
				    new Book("php",400),
				    new Book("c",300),
				    new Book("android",987)
				};
		Arrays.sort(arr);
		
		for(Book s:arr) {
			System.out.println(s);
		}
	}
	//New ordering
}
