package maxmin_unsorted;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Maximum
		System.out.println("====Using basic java====");
		int arr[]= {1,8,99,74,65,35,55};
		
		int max=arr[0];
		int min=arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : " + min);
		
		System.out.println("====Using Enhanced for loop====");
		for(int num : arr) {
			if(num>max) max=num;
			if(num<min) min=num;
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : " + min);
		
		System.out.println("====Using streams====");
		int maximum=Arrays.stream(arr).max().getAsInt();
		int minimum=Arrays.stream(arr).min().getAsInt();
		System.out.println("Maximum number is : " + maximum);
		System.out.println("Minimum number is : " + minimum);
		
		System.out.println("====Using Ternary operator====");
		for(int num : arr) {
			max=num>max ? num:max;
			min=num<min ? num:min;
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : " + min);
	}
}
