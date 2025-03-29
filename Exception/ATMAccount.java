package Exception;

public class ATMAccount {	
	double balance;
	double pin;
	public ATMAccount(double balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(double amount,double minimumbal) throws InsufficientBalanceException{
		if(amount>balance) {
			System.out.println("you have a shortage of "+(balance-amount-minimumbal)+" Rupees");
			throw new InsufficientBalanceException();
		}
		else if(amount==balance){
			System.out.println("Please enter a lesser amount!");
		}
		else {
			balance-=amount;
			System.out.println("Withdraw successful");
		}
	}
	public void viewBalance() {
		System.out.println("Your balance is "+balance+" rupees");
	}
	public void pinChange(Double newPin) {
		
		if(newPin>999&&newPin<10000) {
			pin=newPin;
			System.out.println("PIN successfully changed.");
		}
		else {
			System.out.println("Invalid PIN. Please enter a 4-digit number.");
		}
	}
}
