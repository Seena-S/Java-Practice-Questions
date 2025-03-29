package multithreading;

//public class PrintingChars extends Thread {
//	@Override
//	 public void run() {
//		 System.out.println("Run method of print Char!! started");
//		 for(char c='a';c<='z';c++) {
//				System.out.println(c);
//		 }
//		 System.out.println("Run method of print Char!! ended");
//	}	
//}	
public class PrintingChars implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method of print Char!! started");
		 for(char c='a';c<='z';c++) {
				System.out.println(c);
		 }
		 System.out.println("Run method of print Char!! ended");
	}	
}
