package array;


public class first_non_repeating {

	public static void main(String[] args) {

		String str = "tesst";
		
		for (int i=0; i<str.length();i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					System.out.println("repeating characters :- "+str.charAt(j));
				}
			}
		}
		
		
	}

}
