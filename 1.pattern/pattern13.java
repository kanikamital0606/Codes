/*

1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
1	5	10	10	5	1

*/


//using Ncr method therefore use row(i) from .0 instead of 1;

import java.util. *;
public class pattern13{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int size =  scn.nextInt();

		for (int n=0; n<size; n++) {

			int ncr=1;

			for (int r=0; r<=n; r++) {
				
				System.out.print(ncr+"\t");
				int ncrpo = ((n-r)*(ncr))/(r+1); 
				ncr = ncrpo;
			}
			System.out.println();
		}
	}
}