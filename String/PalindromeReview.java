public class PalindromeReview {
   	
	public static void main(String[] args) {
		
		String str = "Madam";
		
		boolean result = PalindromeReview(str);
		
		if(result) {
			System.out.println(str+" is a palindrome. ");
		}else {
			System.out.println(str+" is not a palindrome. ");
		}
		
		
	}
    
	public static boolean PalindromeReview(String str) {
		//1.null ? trimed ? empty? 2.boolean return, reusable code 3.case standardization 4.reverse character 5.compare it  
		if(str==null || str.trim().isEmpty()) {
			return false;
		}
		else {
			str = str.toLowerCase();
			String reversed = new StringBuilder(str).reverse().toString();
			if(str==reversed) {
				return true;
			}
			return false;
		}
	}

}
