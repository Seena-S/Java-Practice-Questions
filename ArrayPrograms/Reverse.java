package ArrayPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scn.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements...");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();					
		}
		System.out.println("Array elements are: ");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("Reversed elements are: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
