import java.util.Scanner;

public class PalindromeReview {
   	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
		
        sc.close();
		
		if(isPalindromeReview(str)) {
			System.out.println(str+" is a palindrome. ");
		}else {
			System.out.println(str+" is not a palindrome. ");
		}
		
		
	}
    
	public static boolean isPalindromeReview(String str) {
		//1.Check if the string is null or empty.
        //2. Normalize the string by converting it to lowercase.
        //3. Reverse the string using StringBuilder.
        //4. Compare the original string with the reversed string.  
		if(str==null || str.isBlank()) {
			return false;
		}
		
			str = str.trim().toLowerCase();
			String reversed = new StringBuilder(str).reverse().toString();
			return str.equals(reversed);
			
		
	}

}
