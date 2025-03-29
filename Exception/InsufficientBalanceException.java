package Exception;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		System.out.println("You are out of balance");
	}

}
