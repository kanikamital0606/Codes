/*


						*			
					*	*	*		
				*	*	*	*	*	
					*	*	*		
						*	

*/

import java.util. *;
public class pattern5{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int nsp= n/2;
		int nstar= 1;

		for (int i=1; i<=n; i++) {

			for(int csp=1; csp<=nsp; csp++){

				System.out.print("\t");
			}

			for (int j=1; j<=nstar; j++) {
				System.out.print("*\t");
			}

			if(i<=n/2){
				nsp--;
				nstar +=2;
			}
			else{
				nsp++;
				nstar-=2;
			}

			System.out.println();
		}
		
	}
}