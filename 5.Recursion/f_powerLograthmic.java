import java.io.*;
import java.util.*;

public class f_powerLograthmic{

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();

		int ans = power(x,n);
		System.out.println(ans);
	}

	public static int power(int x, int n){

		// base case
		if(n==0){
			return 1;
		}

		int ans = power(x,n/2);

		if(n%2==0){
			return ans*ans;
		}
		else{
			return ans*ans*x;
		}
	}
}