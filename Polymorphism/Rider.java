package Polymorphism;

public class Rider {
	
	void ride(Bike b) {
		System.out.println("executing ride with bike argument");
		b.start();//run time polymorphism
	}
	void ride(Pulsar b) {
		System.out.println("executing ride with Pulsar argument");
		b.start();//run time polymorphism
	}

}
