package search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Give the number you want to search: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int arr[]= {1,2,9,7,66,78,42};
		boolean found = false;
		/* Using For Loop
		 * for(int i=0;i<arr.length;i++) { if(arr[i]==target) {
		 * System.out.print("Element found at : " + i); found = true; } }
		 * if(!found) {
		 * System.out.println("Ëlement not found"); }
		 */
		/* Using Advanced for loop
		 * for(int num: arr) { if(num==target) { System.out.print("Element found ");
		 * found = true; return; } } if(!found) {
		 * System.out.println("Ëlement not found"); }
		 */
		//Using Streams
		/*boolean exists = Arrays.stream(arr).anyMatch(num -> num==target);
		System.out.println(exists? "found": "Not found");*/
		
		int i = 0, position=-1;
		for(int num : arr){
		    position=(num==target)?i:position;
		    i++;
		}
		if(position==-1){
			System.out.println ("Element not found");
		} else {
			System.out.println ("Element found at position: "+ position);
		}
		
		sc.close();
	}
}
