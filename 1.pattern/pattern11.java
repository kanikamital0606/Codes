/*
				1	
				2	3	
				4	5	6	
				7	8	9	10	
				11	12	13	14	15	
*/

import java.util. *;
public class pattern11{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int nstr =1;
		int count = 1;

		for (int i=1; i<=n; i++) {

			for (int j=1; j<=nstr; j++) {
				System.out.print(count + "\t");
				count++;
			}
			nstr++;
			System.out.println();
		}
		
	}
}