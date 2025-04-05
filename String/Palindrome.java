public class Palindrome {

	public static void main(String[] args) {



		//What do I want my program to do ?  - checking if a string is a palindrome. 

		String str = "Madam";

		

		Palindrome.isPalindrome(str);

	

		

	}

	

	public static void isPalindrome(String str) {

		

		//what if it's empty string?

		if(str.isEmpty()) {

			System.out.println("it's empty.");

		}

		else{

			//what if it has a spaces and mixed-case?

			//Since Java String is immutable, it always return a new string . so I need to store it in a new variable.

			String cleaned = str.replace(" ","").toLowerCase();

			

			//reverse it. using reverse method of StringBuilder. and convert it into String for store it into String object.

			String reversed = new StringBuilder(cleaned).reverse().toString();

			

			//compare it with the original string.

			if(reversed.equals(cleaned)) {

				System.out.println("it's palindrome.");

			}else {

				System.out.println("it's not palindrome.");

			}

			

		}

		

	}

}