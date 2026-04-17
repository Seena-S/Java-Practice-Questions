package firstAndLastPosUnsorted;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		int [] arr= {1,3,5,4,8,9,5,6,5,9,1};
		int target=5;
		
		int first= -1, last= -1;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == target) {
		        if (first == -1) first = i;
		        last = i;
		    }
		}
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		
		
		System.out.println("====For-Each with Index====");
	//	Since for-each does’t give index, you must track it manually:

		int index = 0;

		for (int num : arr) {
		    if (num == target) {
		        if (first == -1) first = index;
		        last = index;
		    }
		    index++;
		}

		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		

		System.out.println("====Ternary style====");
		for (int i = 0; i < arr.length; i++) {
		    first = (arr[i] == target && first == -1) ? i : first;
		    last  = (arr[i] == target) ? i : last;
		}
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		
		
		System.out.println("====Using Streams====");
		
		//Streams don’t directly track index, so use IntStream
		
		int first1 = IntStream.range(0, arr.length)
					.filter(i -> arr[i]==target)
					.findFirst()
					.orElse(-1);
		int last1 = IntStream.range(0, arr.length)
					.filter(i -> arr[i]==target)
					.reduce((a,b) -> b) //👉 = “Give me the last element”
					.orElse(-1);
		System.out.println("First: " + first1);
		System.out.println("Last: " + last1);
		
		
		System.out.println("====String - Streams====");
		String str = "banana";
		char target1 = 'a';

		int first2 = IntStream.range(0, str.length())
		        .filter(i -> str.charAt(i) == target1)
		        .findFirst()
		        .orElse(-1);

		int last2 = IntStream.range(0, str.length())
		        .filter(i -> str.charAt(i) == target1)
		        .reduce((a, b) -> b)
		        .orElse(-1);
		System.out.println("First: " + first2);
		System.out.println("Last: " + last2);
	}

}
