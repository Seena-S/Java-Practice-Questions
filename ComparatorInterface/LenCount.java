package ComparatorInterface;

import java.util.Comparator;

public class LenCount implements Comparator {
	
	
	@Override
	public int compare(Object o1, Object o2) {
		
		return ((String)o1).length()-((String)o2).length();
	}

}


