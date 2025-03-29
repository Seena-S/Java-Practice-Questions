package core.OverridingDemo;

public class A {
	void m1() {
		System.out.println("m1 in A");
	}
	void m2() {
		System.out.println("M2 in B");
	}

}
class B extends A{
    void m1() {
    	System.out.println("m1 in B");
	}
    
}
class C extends B{
	void m2() {
		System.out.println("m2 in C");
	}
}