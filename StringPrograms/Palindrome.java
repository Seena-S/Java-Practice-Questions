package StringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=scn.nextLine();//MAdam
		s1=s1.toLowerCase();//madam
		int flag=0;
		int n=s1.length();//5
        
		for(int i=0;i<n/2;i++) {
			if(s1.charAt(i)==s1.charAt(n-1-i)){
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Given string '"+s1+"' is a palindrome");
		}
		else {
			System.out.println("Given string '"+s1+"' is not a palindrome");
		}
	}
}
