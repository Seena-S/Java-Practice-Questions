package firstAndLastPosSorted;

public class Main {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,5,5,5,5,5,5,5,5,5,6,7,8,9};
		int left=0, right=arr.length-1, target=5;
		int first= -1, last= -1;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if (arr[mid] == target) {
		        if (first == -1) first = mid;
		        
		    }
		}
	}

}
