package Day22;

import java.util.Scanner;

public class StringExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter any String : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		s.close();
		
		char ch = str.charAt(str.length()-1);
		System.out.println();
		System.out.println(ch + str + ch);
	}

}
