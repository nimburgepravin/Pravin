package array;

public class MaxMin {

	public static void main(String[] args) {

		int [] a = {63,75,99,84,53,88,98} ;
		
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if (a[i]<min) {
				
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
