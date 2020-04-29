import java.io.*;
import java.util.*;

public class factorial{

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int ans = fact(n);
		System.out.println(ans);
	}

	public static int fact(int n){

		if(n==1){
			return 1;
		}

		int num1 = fact(n-1);
		int nfact = num1*n;
		return nfact;
	}
}