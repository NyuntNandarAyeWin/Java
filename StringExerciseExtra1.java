package Day22;

public class StringExerciseExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print(res+" ");
				res++;
			}
			System.out.println();
		}
	}

}
