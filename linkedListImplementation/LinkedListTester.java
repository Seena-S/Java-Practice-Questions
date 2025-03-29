package linkedListImplementation;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList m1=new LinkedList();
		m1.add(25);
		m1.add(567);
		m1.add("java");
		m1.add("spring");
		System.out.println(m1);
		System.out.println(m1.get(3));
		System.out.println(m1.size());
	}
}