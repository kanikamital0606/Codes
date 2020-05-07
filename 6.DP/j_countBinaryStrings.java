//////////////////////////////////////Count Binary Strings
/*
Question
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.

Input Format:   A number n  //6
Output Format:  A number representing the number of binary strings of length n with no consecutive 0's. //21

*/
import java.io.*;
import java.util.*;

public class j_countBinaryStrings{
	public static void main(String[] args) throws Exception{
    // write your code here
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] dp = new int[2][n+1];

		//base case
		dp[0][1] =1;
		dp[1][1] =1;
		
		for(int i=2; i<=n; i++){
			dp[0][i] = dp[1][i-1];
			dp[1][i] = dp[0][i-1] + dp[1][i-1];
		}
		System.out.println(dp[0][n] + dp[1][n]);
	}
}