package AbstractionDemo;

public interface Vehicle {
	
	void changeGear(int g);
	void applyBrake(int a);
	void speedUp(int s);

}
class Bicycle implements Vehicle{
	int gear;
	int speed=2;

	@Override
	public void changeGear(int g) {
		
		gear=g;
	}

	@Override
	public void applyBrake(int a) {
		
		speed=speed-a;
	}

	@Override
	public void speedUp(int s) {
		
		speed=s+2*speed;
	}
	
	void display() {
		System.out.println("Bicycle==>  speed= "+speed+" gear= "+gear);
	}
	
}
class Bike implements Vehicle{
	int gear=2;
	int speed=6;

	@Override
	public void changeGear(int g) {
		
		gear=g;
	}

	@Override
	public void applyBrake(int a) {
		
		speed=speed-a;
	}

	@Override
	public void speedUp(int s) {
		
		speed=s+speed;
	}
	
	void display() {
		System.out.println("Bike==> speed= "+speed+" gear= "+gear);
	}
	
}