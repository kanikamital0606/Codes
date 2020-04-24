/*

				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*

*/

import java.util. *;
public class pattern3{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int nstr =1;
		int nspace = n-1;

		for(int i=1; i<=n; i++){

			for(int csp=1; csp<=nspace; csp++){
				
				System.out.print("\t"); 
			}
			for (int j=1; j<=nstr; j++){

				System.out.print("*\t");
			}

			nspace--; //space decrement
			nstr++;  //star increment
			System.out.println();
		}
		
	}
}