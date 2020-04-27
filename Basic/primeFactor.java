import java.util.*;

public class primeFactor{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int n= scn.nextInt();

		int div =2;

		while(div*div<=n){
			if(n%div==0){
				System.out.print(div + " ");
			}
			else{
				div++;
			}

			if(n!=1){
				System.out.println(n);
			}
		}
	}
}