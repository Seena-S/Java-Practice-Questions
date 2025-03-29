package AbstractionDemo;

public class Tester {

	public static void main(String[] args) {
		 Bicycle b1=new Bicycle();
		 b1.speedUp(4);
		 b1.changeGear(3);
		 b1.applyBrake(2);
		 b1.display();
		 System.out.println("Bicycle moving");

		 Bike b2= new Bike();
		 b2.speedUp(4);
		 b2.changeGear(3);
		 b2.applyBrake(2);
		 b2.display();
		 System.out.println("Bike moving");
	}

}
