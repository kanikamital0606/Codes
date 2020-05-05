import java.io.*;
import java.util.*;

public class a_factorial{
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fact(n);
		System.out.println(ans);
	}

	public static int fact(int n){
		//Base Case
		if(n==1){
			return 1;
		}
		
		int num1 = fact(n-1); //factorial till n-1 means n-1= 4-1 = 3 
		int nfact = num1*n;   //3 *4! = 24;
		return nfact;
	}
}
//Example take N=4