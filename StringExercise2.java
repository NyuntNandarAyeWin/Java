package Day22;

import java.util.Scanner;

public class StringExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your String : ");
		
		String str = s.nextLine();
		
		System.out.print("\nEnter remove position : ");
		int pos = s.nextInt();
		
		s.close();
		
		System.out.println("User input string : "+ str);
		
		System.out.println("New String : "+str.substring(0, pos) + str.substring(pos + 1));
	}
}
