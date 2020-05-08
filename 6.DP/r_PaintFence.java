/////////////////////////////////////////////////////////Paint Fence
/*
   1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two fences have same colors.

Input Format: 	A number n,  k
Output Format:	Number of ways in which the fences could be painted so that not more than two fences have same colors.

Sample Input:	8,   3							Sample Output:	3672 
*/
import java.io.*;
import java.util.*;

public class r_PaintFence{

	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt(); //no of fences
		int k = scn.nextInt(); //no of colours

		//dp
		int[][] dp = new int[2][n]; //k-1 = 3-1 =2

		dp[0][0] = 0; //same
		dp[1][0] = k; //different

		for(int col =1; col<n; col++){
			dp[0][col] = dp[1][col-1];
			dp[1][col] = (dp[0][col-1] + dp[1][col-1]) * (k-1); //(same+Difference) *(k-1)
		}
		System.out.println(dp[0][n-1]+dp[1][n-1]);
	}
}