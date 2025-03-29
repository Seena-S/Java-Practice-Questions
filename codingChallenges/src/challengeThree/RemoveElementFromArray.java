package challengeThree;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        int[] newArray = removeElement(array, elementToRemove);

        System.out.println("Array after removing the element:");
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] arr, int element) {

        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }

        if (count == 0) {
            return arr;
        }

        int[] newArray = new int[arr.length - count];
        int index = 0;

        for (int num : arr) {
            if (num != element) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }
}

