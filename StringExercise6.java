package Day22;

import java.util.Scanner;

public class StringExercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter factorial number : ");
		int fact = s.nextInt();
		s.close();
		if(fact == 0 || fact == 1) {
			System.out.println("Factorial result : "+ result);
		}
		for(int i=2; i<=fact; i++) {
			result *= i;
		}
		System.out.println("Factorial result : "+ result);
			
	}

}
