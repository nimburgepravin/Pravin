package array;

public class linear_or_Algorithm {

	public static void main(String[] args) {

		int [] a = {8,5,9,7,3,2,6} ;
		
		int item = 11;
		int temp = 0 ;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==item) {
				
				System.out.println("the item is at index of "+i);
				
				temp = temp + 1 ;
			} 
				
		}if(temp==0) {
		System.out.println("the item is not present");}
	}

}
