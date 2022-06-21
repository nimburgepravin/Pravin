package array;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {

 
		int[] a = new int [] {29,36,2,52,12,9,11} ;
		
		Arrays.sort(a);
		
		for(int i=a.length-1; i>=0; i--) {
			
			System.out.print(a[i]+" ");
		}
		
		
	}

}
