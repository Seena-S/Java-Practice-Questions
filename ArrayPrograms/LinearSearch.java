package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scn.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements...");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();					
		}
		System.out.println("Enter the search element...");
		int emt=scn.nextInt();
		int flag=0;
		int i;
		for(i=0;i<arr.length;i++) {
			if(emt==arr[i]) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Search element found in "+ (i-1) +" th position");
		}
		else {
			System.out.println("Search element not found");
		}

	}

}
