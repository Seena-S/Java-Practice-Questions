package InterfaceDemo;

public interface Phone {
	void on();
	void dial();

}
class CameraPhone{
	
	void takePhoto() {
		System.out.println("Taking Photo");
	}
	void on() {
		System.out.println("Camera Phone ON");
	}
}
class samsung extends CameraPhone implements Phone{

	@Override
	public void dial() {		
		System.out.println("Dialing number...");
	}
	@Override
	public void on() {
		System.out.println("Samsung Phone ON");
	}
	
}