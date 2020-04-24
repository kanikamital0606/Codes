/*
				1
			2	3	2
		3	4	5	4	3
			2	3	2
				1		
*/


import java.util. *;
public class pattern15{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int nsp = n/2;
		int nstar = 1;
		int oval = 1;

		for (int i=1; i<=n; i++) {

			int ival = oval;
			for (int csp =1; csp<=nsp; csp++) {
				System.out.print("\t");
			}

			for (int j=1; j<=nstar; j++) {
				
				System.out.print(ival+"\t");
				//ival = j<=nstar/2 ? ival+1:ival-1;
				if (j<=nstar/2) {
					ival++;
				}
				else{
					ival--;
				}
			}

			if(i<=n/2){
				nsp--;
				nstar+=2;
				oval ++;
			}
			else{
				nsp++;
				nstar -=2;
				oval--;
			}

			System.out.println();
		}
	}
}