import java.util.Scanner;

public class MathematicalOperationsUsingFunctions {
	public static void main(String args[]) {
		
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		System.out.println("Select the mathematical operation you want to perform.\n1 for addition \n2 for subtraction \n3 for multiplication \n4 for division \n Enter your choice: ");
		int choice=sc.nextInt();
		
		Operations obj= new Operations();
		
		if(choice==1){
			obj.addition(num1,num2);
	        
	    }else if(choice==2){
	    	obj.subtraction(num1,num2);
	    	
	    }else if(choice==3){
	    	obj.multiplication(num1,num2);
	    	
	    }else if(choice==4){
	    	obj.division(num1,num2);
	    	
	    }else{
	        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
	    }
		obj.displayResult();
	}

}
