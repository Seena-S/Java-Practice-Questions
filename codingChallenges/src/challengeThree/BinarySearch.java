package challengeThree;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
           
            if (arr[mid] == target) {
                return mid; 
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1; 
    }
}
