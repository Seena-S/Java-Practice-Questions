package interThreadCommunication;

public class Account {
	
	double balance=5000;
	
	synchronized public void withdraw(double amt) {
		System.out.println("Going to withdraw...");
		if(amt>=balance) {
			System.out.println("Less amount, please wait to deposit");
			try {
				wait();//Thread t1 tries to withdraw 7000 from the account. Since the balance is only 5000, 
				       //it prints a message and waits (because wait() is called).
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		balance-=amt;
		System.out.println("Withdraw completed");
		System.out.println("Current balance: "+balance);  
	}
	synchronized void deposit(double dep) {//Both methods are synchronized, meaning only one thread can execute them at a time on the same Account instance.
		System.out.println("Depositing amount....");
		balance+=dep;
		System.out.println("Depositing completed...");
		notify();//Thread t2 deposits 5000 into the account. After the deposit, it calls notify(), which wakes up the waiting thread.
		}

}
