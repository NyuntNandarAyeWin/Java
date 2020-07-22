package Day22;

import java.util.Scanner;

public class StrringExercise4 {

	public static void main(String[] args) {
		String tch = null;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your String : ");
		
		String str = s.nextLine();
		s.close();
		System.out.println("User input string : "+ str);
		if(str.length() > 3) {
			
			 tch = str.substring( 0, 3);
			
		}else {
			tch = str;
		}
		System.out.println("New String : "+tch+str+tch);
	}

}
