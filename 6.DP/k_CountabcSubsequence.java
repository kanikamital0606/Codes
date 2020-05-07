/////////////////////////////////////////////////////////Count A+b+c+ Subsequences
/*
Question
1. You are given a string str.
2. You are required to calculate and print the count of subsequences of the nature a+b+c+.

For abbc -> there are 3 subsequences. abc, abc, abbc
For abcabc -> there are 7 subsequences. abc, abc, abbc, aabc, abcc, abc, abc

Input Format A string str
Output Format count of subsequences of the nature a+b+c+

Sample Input: abcabc
Sample Output : 7

*/
import java.io.*;
import java.util.*;

public class k_CountabcSubsequence{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		//int[][] dp = new int[3][str.length()+1];

		int a=0;
		int b=0;
		int c=0;

		//for(int col = 1; col <dp[0].length; col++)
		for(int col = 0; col<str.length();col++){
			if( str.charAt(col) == 'a'){  //col -1
				a = (2*a)+1;
				// dp[0][col] = 2 *dp[0][col-1]+1;
				// //---------------------------------------------
				//dp[1][col] = dp[1][col-1]
				//dp[2][col] = dp[2][col-1]
			}
			else if(str.charAt(col)=='b'){ //col -1
				b=(2*b)+a;
				// dp[1][col] = 2 *dp[1][col-1]+ dp[0][col-1];
				// //---------------------------------------------
				//dp[0][col] = dp[0][col-1]
				//dp[2][col] = dp[2][col-1]
			}

			else if(str.charAt(col)=='c'){ //col -1
				c=(2*c)+b;
				// dp[2][col] = 2 *dp[2][col-1]+ dp[1][col-1];
				// //---------------------------------------------
				//dp[0][col] = dp[0][col-1]
				//dp[1][col] = dp[1][col-1]
			}	
		}
		System.out.println(c);
	}
}
