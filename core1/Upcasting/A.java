package core1.Upcasting;

public class A {
    void test1() {
    	System.out.println("test1 in A");
    }
    static void test2() {
    	System.out.println("test2 in A");
    }
}
class B extends A{
	@Override
	void test1() {
    	System.out.println("test1 in B");
    }
	static void test2() {
    	System.out.println("test2 in B");
    }
}
class C extends A{
	@Override
	void test1() {
    	System.out.println("test1 in C");
    }
	static void test2() {
    	System.out.println("test2 in C");
    }
}
class Tester{
	public static void main(String[] args) {
		
		m1(new B());
		m1(new C());
	}
	static void m1(A a1) {
		a1.test1();
		a1.test2();
	}
}