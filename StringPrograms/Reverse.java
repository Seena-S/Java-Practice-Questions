package StringPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=scn.next();
		String r=ReverseString(s1);
		System.out.println("Reversed string: "+r);

	}
	public static String ReverseString(String s) {
		String rev="";
		if(s==null) {
			return null;
		}
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
	    return rev;
	}

}
