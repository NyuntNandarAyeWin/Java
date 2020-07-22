package Day22;

import java.util.Scanner;

public class StringExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your String : ");
		
		String str = s.nextLine();
		char fch = str.charAt(0);
		char lch = str.charAt(str.length()-1);
		s.close();
		
		System.out.println("User input string : "+ str);
		System.out.print("new string : "+lch);
		int i = 1;
		while(i != str.length()-1) {
			System.out.print(str.charAt(i));
			i++;
		}
		System.out.println(fch);
	}

}
