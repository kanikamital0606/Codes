/*

*								*	
*	*						*	*	
*	*	*				*	*	*	
*	*	*	*		*	*	*	*	
*	*	*	*	*	*	*	*	*	

*/
import java.util. *;
public class pattern16a{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int sp =2*n-3;
		int str =1;

		for (int i=1; i<=n; i++){

			//for star
			for (int j=1; j<=str; j++) {

				System.out.print("*\t");
			}

			//for space
			for (int j=1; j<=sp; j++) {

				System.out.print("\t");
			}

			//for star
			for (int j=1; j<=str; j++) {

				System.out.print("*\t");
			}

			str++;
			sp -=2;
			
			System.out.println();
		}
	}
}