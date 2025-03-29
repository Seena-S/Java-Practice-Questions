package Polymorphism;

public class Tester {

	public static void main(String[] args) {
		Rider r1=new Rider();
		//Pulsar p1=new Pulsar();
		//r1.ride(p1);
		
//		Bike p1=new Pulsar();
//		r1.ride(p1);  //compile time polymorphism
		
		Bike p1=new Bike();
		r1.ride(p1);

	}

}
