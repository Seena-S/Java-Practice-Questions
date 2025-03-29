package arrayListImplementation;

public class ArrayList {
	Object[]arr=new Object[3];
	int ind=0;
	public void add(Object element) {
		if(ind>=arr.length) {
			increase();
			arr[ind++]=element;
		}
	}
	public void increase() {
		int newSize=arr.length+(arr.length/2);
		Object[]newArray=new Object[newSize];
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		System.out.println(newArray.length);
		arr=newArray;
	}
	
	public Object get(int index) {
		if(index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public int size() {
		return ind;
	}
	public String toString() {
		if(size()==0) 
			return "[]";
		String s1="["+get(0);
		for(int i=1;i<size();i++) {
			s1=s1+","+get(i);
		}
		s1=s1+"]";
		return s1;
	}
}
