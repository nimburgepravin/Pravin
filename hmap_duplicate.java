package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hmap_duplicate {

	public static void main(String[] args) {
		
//		int[] arr = {5,3,4,2,5,5,3,4,1,2} ;
//
//		Map<Integer,Integer> hmap = new HashMap<>();
//		
//		for(int no:arr) {
		
//			
//			Integer count = hmap.get(no);
//			if(count == null) {
//				
//				hmap.put(no, 1);
//			}else {
//				count = count + 1 ;
//				hmap.put(no,count);
//			}
//		}
//		
//		System.out.println("Duplicate elements are : ");
//		
//		Set<Map.Entry<Integer,Integer>> es = hmap.entrySet();
//		
//		for(Map.Entry<Integer, Integer> me : es) {
//			
//			if(me.getValue()>1) {
//				
//				System.out.println(me.getKey()+" ");
//			}
//		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

 int [] arr = {5,3,4,8,5,3,9,2,1,2,5,4,3};
 
 Map<Integer,Integer> hmap = new HashMap<>();
 
 for(int no:arr) {
	 
	 Integer count = hmap.get(no);
	 
	 if(count==null)
	 {
		 hmap.put(no, 1);
		 
	 }else {
		 
		 count = count+1;
		 hmap.put(no, count);
	 }
 }
	 
	 System.out.println("Duplicate numbers are : ");
	 Set<Map.Entry<Integer, Integer>> es = hmap.entrySet();
	 
	 for(Map.Entry<Integer, Integer> me : es) {
		 
		 if(me.getValue()>1) {
			 
			 System.out.println(me.getKey()+" ");
		 }
		 
		 
	 }
 }
 
 
	

}
