import java.util.Scanner;

public class PalindromeReview {
   	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
		boolean result = PalindromeReview(str);
        sc.close();
		
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
		
			str = str.toLowerCase();
			String reversed = new StringBuilder(str).reverse().toString();
			return str.equals(reversed);
			
		
	}

}
