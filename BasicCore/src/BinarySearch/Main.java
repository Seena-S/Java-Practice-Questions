package BinarySearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("====Ascending array====");
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;

		int left = 0, right = arr.length - 1;
		int result = -1;

		while (left <= right) {
		    int mid = left + (right - left) / 2;

		    if (arr[mid] == target) {
		        result = mid;
		        break;
		    } else if (arr[mid] < target) {
		        left = mid + 1;
		    } else {
		        right = mid - 1;
		    }
		}

		System.out.println("Index: " + result);
		
		// descending array
		System.out.println("====Descending array====");
		
		int [] arr1 = {10,9,8,7,6,5,4,3,2,1};
		int target1 = 8;

		int left1 = 0, right1 = arr.length - 1;
		int result1 = -1;

		while (left1 <= right1) {
		    int mid1 = left1 + (right1 - left1) / 2;

		    if (arr1[mid1] == target1) {
		        result1 = mid1;
		        break;
		    } else if (arr1[mid1] < target1) {
		    	right1 = mid1 - 1;
		    } else {
		    	left1 = mid1 + 1;
		    }
		}

		System.out.println("Index: " + result1);
		
		// Java 8 / Streams

		// Not ideal, but possible:

		System.out.println("====Using Streams====");

		int index = Arrays.binarySearch(arr, target);

		System.out.println("Index: " + index);
		
		
		//🔤 STRING VERSION (Binary Search)
		String[] array = {"apple", "banana", "cherry", "date"};
		String target2 = "cherry";

		int index1 = Arrays.binarySearch(array, target2);

		System.out.println("Index: " + index1);

	}

}
