package array;

public class selection_sort {

	public static void main(String[] args) {

//     int min ; int temp = 0 ;
//		
//		int [] a = {38,52,9,18,6,62,13 } ;
//		
//		for (int i=0;i<a.length;i++) {
//			
//			min = i ;
//			
//			for (int j=i+1 ;j<a.length; j++) {
//				
//				if (a[j]<a[min]) {
//					
//					min = j ;
//				}
//			}
//			temp = a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//for(int i=1; i<a.length; i++) {
//			
//			
//			System.out.print(a[i]+" ");
//		}
		
//----------------------------------------------------------------------------------------------------------------------------
		
		String [] a = {"pravin","sachin","swapnil"," mukund","shubham" } ;
		
		String temp = ""; int min ;
		
		for (int i=0;i<a.length;i++) {
			
			min = i ;
			
			for (int j=i+1 ;j<a.length; j++) {
				
				if (a[j].compareTo(a[min])<0) {
					
					min = j ;
				}
			}
			temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
 for(int i=0; i<a.length; i++) {
			
			
			System.out.print(a[i]+" ");
		}
	}

}
