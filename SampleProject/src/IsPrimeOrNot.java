import java.util.Scanner;

public class IsPrimeOrNot {
	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,flag=0;
		
		for(i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+ " is a prime number.");
		}
		else {
			System.out.println(num+ " is not a prime number.");
		}
	
	}

}
