import java.util.*;

public class primeCheck{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		
		//No of prime no to check 
		int t = scn.nextInt();

		for (int sol=0; sol<t; sol++){
			int n = scn.nextInt();

			int div =2;

			while (div*div <= n){
				if(n%div ==0) {
					break;
				}
				div++;
			}

			if(div*div >n){
				System.out.println("Prime");
			}
			else{
				System.out.println("Not Prime");
			}
		}
			
	}
}