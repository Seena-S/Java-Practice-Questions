package interThreadCommunication;

public class Tester {

	public static void main(String[] args) {
		Account a1=new Account();				
		Thread t1=new Thread()//A thread that attempts to withdraw 7000 from the account.
		{
			public void run() {
				a1.withdraw(7000);
			}
		};
		Thread t2=new Thread()//A thread that deposits 5000 into the account.
		{
			public void run() {
				a1.deposit(5000);
			}
		};
		t1.start();//These methods start the execution of the threads.
		t2.start();
	}
}
