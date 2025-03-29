package ComparableInterface;

public class Book implements Comparable {
	String title;
	int pages;
	
	public Book(String title, int pages) {
		super();
		this.title = title;
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + "]";
	}
	
	@Override
	public int compareTo(Object x) {
		Book b=(Book)x;
//		return pages-b.pages;
		return title.compareTo(b.title);
	}
}