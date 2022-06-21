package array;

import java.util.HashSet;
import java.util.Set;

public class set_duplicate_char {

	public static void main(String[] args) {
		
		int[] arr = {5,2,3,3,4,5,2,3,2,1,4,5,4} ;

		Set<Integer> set = new HashSet<> ();
		
		for(int no:arr) {
		  
			if(set.add(no)==false) {
			
			System.out.println(no);
			
		}
		}
	}

}
