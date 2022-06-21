package array;

public class delete {

	public static void main(String[] args) {

		int [] a = {10,45,30,17,36,45} ;
		
		int del = 17 ;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==del) {
				
				for(int j=i; j<a.length-1; j++) {
					
					a[j]=a[j+1] ;
				}
			}
		}
		for (int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
			}
		}

}
