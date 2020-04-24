/*
i/p 5

1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1	

*/
import java.util. *;
public class pattern16{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int n =  scn.nextInt();

		int sp =2*n-3;
		int str =1;

		for (int i=1; i<=n; i++) {

			int val =1; //to increae in star

			for (int j=1; j<=str; j++) {

				System.out.print(val+"\t");
				val++;
			}

			for (int j=1; j<=sp; j++) {
				System.out.print("\t");
			}

			if (i==n){
				str--;
				val--;
			}

			for (int j=1; j<=str; j++) {
				val--;
				System.out.print(val+"\t");
			}

			str++;
			sp -=2;
			
			System.out.println();
		}
	}
}