/*


				*			
			*			
		*		
	*		
*
*/

import java.util. *;
public class pattern8{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int nsp= n;
		int nstar=1;

		for (int i=1; i<=n; i++) {

			for (int csp =1; csp<nsp; csp++){

				System.out.print("\t");
			}

			for (int j=1; j<=nstar; j++) {
				
				System.out.print("*\t");
			}
			nsp--;
			System.out.println();
		}
		
	}
}