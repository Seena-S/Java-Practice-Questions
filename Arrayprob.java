import java.util.Scanner;

public class Arrayprob {

	public static void main(String[] args) {
		int n=5;
		int arr[]=new int[n];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array elements..");
		int i;
		for(i=0;i<n;i++) {
			arr[i]=scn.nextInt();			
		}
		System.out.println("Printing array..");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("sorting array..");
		for(int k=0;k<n-1;k++) {
			int index=0;
			for(int j=k+1;j<n;j++) {
				if(arr[k]>arr[j]) {
					index=arr[k];
					arr[k]=arr[j];
					arr[j]=index;
				}
			}
		}
		System.out.println("sorted array");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("second largest "+arr[n-2]);
		System.out.println("third smallest element "+arr[2]);

	}

}
