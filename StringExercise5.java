package Day22;

import java.util.Scanner;

public class StringExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Name with all lower case : ");
		
		String str = s.nextLine();
		s.close();
		
		char[] chArr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && chArr[i] != ' ' ||  
	                chArr[i] != ' ' && chArr[i - 1] == ' ') {
				if (chArr[i] >= 'a' && chArr[i] <= 'z') {  
                    // Convert into Upper-case 
                    chArr[i] = (char)(chArr[i] - 'a' + 'A'); 
                } 
				else if (chArr[i] >= 'A' && chArr[i] <= 'Z')  
					  
	                // Convert into Lower-Case 
	                chArr[i] = (char)(chArr[i] + 'a' - 'A'); 
			}
		}
		String st = new String(chArr); 
		System.out.println(st);
	}
}
