 	package array;

public class bubble {

	public static void main(String[] args) {

		int [] a = {11,33,77,55,22,44,66} ;
		
		int temp ;
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a.length-1; j++) {
				
				if(a[j]>a[j+1]) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}

}
