package Day22;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		String ans="";
		double res = 0.0; 
		
		do {
			System.out.print("Enter first number : ");
			int num1 = s.nextInt();
			
			System.out.print("Enter second number : ");
			int num2 = s.nextInt();
			
			System.out.print("Choose one operator (+,-,*,/,%) : ");
			String oper = s.next();
			
			switch(oper) {
			   case "+" :
				   res = num1 + num2;
				   System.out.println("Addition two numbers result : "+res);
				   
				   break;
			      
			   case "-" :
				   res = num1 - num2;
				   System.out.println("Subtraction two numbers result : "+res);
				   
				   break;
				   
			   case "*" :
				   res = num1 * num2;
				   System.out.println("Multiplication two numbers result : "+res);
				   
				   break;
			      
			   case "/" :
				   res = num1 / num2;
				   System.out.println("Divide two numbers result : "+res);
				   
				   break;

			   case "%" :
				   res = num1 % num2;
				   System.out.println("Modulus two numbers result : "+res);
				   break;
			   default:
				   break;
			}
			System.out.print("Anser your choice(yes or no) : ");
			ans = s.next();
		}while(ans.equals("yes"));
		s.close();
	}

}
