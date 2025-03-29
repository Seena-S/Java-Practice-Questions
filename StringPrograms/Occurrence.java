package StringPrograms;

import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scn.next();
		
		String temp="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(temp.indexOf(c)!=-1) 
				continue;
			int k= getCount(s,c);
			System.out.println(c+" ="+k);
			temp+=c;
		}

	}
	static int getCount(String s, char c) {
		String d=s.replace(c+"", "");
		return s.length()-d.length();
	}

}
