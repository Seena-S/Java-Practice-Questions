package ComparatorInterface;

import java.util.Arrays;
import ComparatorInterface.LenCount;

public class Demo {

	public static void main(String[] args) {
		String[] arr= {"java","c","python","php","android"};
		
		Arrays.sort(arr, new LenCount());
		
		for(String s:arr) {
			System.out.println(s);
		}

	}

}
