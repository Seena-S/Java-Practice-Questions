package deadLock;

public class DeadThread {
	
	String s1="java";
	String s2="python";
	
	Thread t1=new Thread() {
		@Override                                             //anonymous inner class
		public void run() {
			synchronized(s1) {                                //locking s1
				try {
					System.out.println(Thread.currentThread().getName()+"--Locked--"+s1);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+"--Locked--"+s2);//locking s2
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	Thread t2=new Thread() {
		@Override                                             //anonymous inner class
		public void run() {
			synchronized(s2) {                                   //locking s2	
				System.out.println(Thread.currentThread().getName()+"--Locked--"+s2);			
				synchronized (s1) {                           //locking s1
					System.out.println(Thread.currentThread().getName()+"--Locked--"+s1);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	public static void main(String[] args) {
		DeadThread th=new DeadThread();
		th.t1.start();
		th.t2.start();
	}		

}
