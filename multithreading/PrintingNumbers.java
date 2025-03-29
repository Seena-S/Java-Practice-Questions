package multithreading;

public class PrintingNumbers {

	public static void main(String[] args) {
		System.out.println("Main started!!!");
//		Thread t1=new PrintingChars();
		Runnable t1=new PrintingChars();//Runnable has no start()
		Thread t2=new Thread(t1);
		t2.start();//calls run method
		for(int i=1;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println("Main ened!!!");

	}

}
