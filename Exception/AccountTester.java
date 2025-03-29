package Exception;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		int d=0;
		int pin=3456;
		double minimumbal=2000;
		ATMAccount a1=new ATMAccount(10000);
		Scanner scn=new Scanner(System.in);
		do{
			System.out.println("WELCOME \nPress the below buttons to complete your transactions..."
					+ "\n1......Check Balance"
					+ "\n2......Withdraw amount"
					+ "\n3......ATM Pin change");
			
			int ch=scn.nextInt();
			switch(ch) {
			case 1:
					a1.viewBalance();
					break;				
			case 2:
				System.out.println("Enter the amount");
				double amt=scn.nextDouble();
				try {
					a1.withdraw(amt,minimumbal);
				}
				catch (InsufficientBalanceException e) {					
					//e.printStackTrace();
					System.out.println("Withdraw failed!!!!");
				}
				break;
			case 3:
				System.out.println("Enter your current pin");
				int currentpin=scn.nextInt();
				if(currentpin==pin) {
					System.out.print("Enter your new PIN: ");
					double newPin=scn.nextInt();
					a1.pinChange(newPin);
				}else {
					System.out.println("Incorrect current PIN. PIN change failed.");
				}				
				break;
			default:
				System.out.println("Invalid option!");
			}
			System.out.println("Do you want to continue?"+
					"\n0....continue"+
					"\n1....exit");
			d=scn.nextInt();			
		}
		while(d==0);
		System.out.println(".......THANK YOU......");		
	}
}
