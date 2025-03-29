package ArrayPrograms;

import java.util.Scanner;

public class BubbleSorting {

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
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}					
		}
		System.out.println("Sorted array: ");
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);					
		}

	}

}
