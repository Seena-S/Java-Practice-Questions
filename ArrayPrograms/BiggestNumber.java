package ArrayPrograms;

import java.util.Scanner;

public class BiggestNumber {

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
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}			
		}
		System.out.println("Largest number is: "+max);

	}

}
