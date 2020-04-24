import java.util.*;

public class pattern9{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		
		for(int cr=1; cr<=n; cr++){

			for(int cc=1; cc<=n; cc++){


				//both are diagonal therefore
				if(cr==cc || cr+cc == n+1){

					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
			}

			System.out.println();
		}

	}
}

// 		*				*
// 			*		*
// 				*
// 			*		*	
// 		*				*