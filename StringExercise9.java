package Day22;

import java.util.Scanner;
import java.util.Arrays;

public class StringExercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int size = s.nextInt();
		
		System.out.print("Enter Array number : ");
		int tot = 0;
		int[] arr = new int[size];
		for(int i=0; i< size; i++) {
			arr[i] = s.nextInt();
			tot += arr[i];
		}
		double avg = tot/size;
		s.close();
		Arrays.sort(arr);
		System.out.println("Two minimum numbers : "+ arr[0]+" and "+arr[1]);
		System.out.println("Two maximum numbers : "+ arr[arr.length-2]+" and "+arr[arr.length-1]);
		System.out.println("Average : "+ avg);
	}

}
