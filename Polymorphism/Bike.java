package Polymorphism;

public class Bike {
	void start() {
		System.out.println("Bike start");
	}

}
class Pulsar extends Bike{
	@Override
	void start() {
		System.out.println("Pulsar start");
	}
}