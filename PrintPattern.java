
public class PrintPattern {

	public static void main(String[] args) {
		int n=5;
		int []arr=new int[n];
		for(int i=n;i>=1;i--) {
			for(int j=0;j<n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
