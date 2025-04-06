import java.util.Scanner;

public class StringCompress {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please typing a string: ");
        String input = sc.nextLine();
        
      //1.check if a string is null or empty
        if(input== null || input.isBlank()) {
			System.out.println("Please typing something.");
		}
        else{
        	System.out.println("Compress result: " + compress(input));
        }
    }
	
	public static String compress(String input) {
		//repetition count variable
		int rep = 1;
		//Stringbuilder for storing new string values // single thread
		StringBuilder compressStr = new StringBuilder();
		//store first and next char, compare it 
		for(int i =0 ; i<input.length()-1;  i++) {
			char previous = input.charAt(i);
			char next = input.charAt(i+1);
			
			if(previous==next) {
				rep += 1;
				compressStr.append(previous).append(rep);
			}
			else {
				rep=1;
				compressStr.append(previous).append(rep);
			}
		}
	}

 
}
