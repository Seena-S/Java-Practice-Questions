package ArrayPrograms;

import java.util.Arrays;

public class InbuiltMethodforBinarySearch {

	public static void main(String[] args)
	{
		int arr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(arr);

		int key = 22;
		int res = Arrays.binarySearch(arr, key);

		if (res >= 0)
			System.out.println(
				key + " found at index = " + res);
		else
			System.out.println(key + " Not found");

		key = 10;
		res = Arrays.binarySearch(arr, key);
		if (res >= 0)
			System.out.println(
				key + " found at index = " + res);
		else
			System.out.println(key + " Not found");
	}
}
