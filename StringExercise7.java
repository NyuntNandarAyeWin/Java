package Day22;

import java.util.Scanner;

public class StringExercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String number : ");
		String str = s.nextLine();
		
		s.close();
		System.out.println("Your String Number : "+str);
		System.out.print("New String Number : ");
		int i=0;
		while(i != str.length()) {
			System.out.print(str.substring(i, i+2)+";");
			i+=2;
		}
	}

}
