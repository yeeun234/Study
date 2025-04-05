public class Palindrome {
	public static void main(String[] args) {

		//What do I want my program to do ?  - checking if a string is a palindrome. 
		String str = "Madam";
		
		boolean isPalindrome = Palindrome.isPalindrome(str);
		if(isPalindrome) {
			System.out.println("yes, "+str+" is a palindrome.");
		}else {
			System.out.println("No, "+str+" is not a palindrome.");
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		
		//what if it's null or empty string?
		if(str == null|| str.trim().isEmpty() ) {
			return false;
		}
		
		else{
			//what if it has a spaces and mixed-case?
			//Since Java String is immutable, it always return a new string . so I need to store it in a new variable.
			String cleaned = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
			
			//reverse it. using reverse method of StringBuilder. and convert it into String for store it into String object.
			String reversed = new StringBuilder(cleaned).reverse().toString();
			
			//compare it with the original string.
			return reversed.equals(cleaned);
			
		}
		
	}
}
