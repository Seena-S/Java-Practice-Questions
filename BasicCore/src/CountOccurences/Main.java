package CountOccurences;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {5,44,55,6,2,5,8,5,44};
		int target=44,count=0;
		
		System.out.println("=====Using Core Java=====");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) count++;
		}
		System.out.println(count);
		
		System.out.println("=====Using For Each=====");
		count=0;
		for(int num: arr) {
			count += (num==target) ? 1 : 0;
		}
		System.out.println(count);
		
		System.out.println("=====Using Advanced If=====");
		count=0;
		for (int i = 0; i < arr.length; i++) {
		    count = (arr[i] == target) ? count + 1 : count;
		}
		System.out.println(count);
		
		System.out.println("=====Using streams=====");
		Long count1 = Arrays.stream(arr).filter(num -> num==target).count();
		System.out.println(count1);
		
		
		
		//COUNT OCCURRENCES IN STRING
		
		
		System.out.println("=====String - Using core java=====");
		String str = "oc curen ces";
		char target1 = 'c';
		
		int count12=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target1) count12++;
		}
		System.out.println("Count: " + count12);
		
		System.out.println("=====String - Using For Each=====");
		int count13=0;
		for(char ch : str.toCharArray()) {
			count13+=(ch==target1) ? 1 : 0;
		}
		System.out.println(count13);
		
		System.out.println("=====String - Using streams=====");
		long count11 = str.chars()
                .filter(ch -> ch == target1)
                .count();
		System.out.println("Count: " + count11);
	}

}
