/////////////////////Buy And Sell Stocks - K Transactions Allowed
/*
1. Given number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. number k, representing the number of transactions allowed.
3. You are required to print the maximum profit you can make if you are allowed k transactions at-most.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)

Input Format: 	n 9.... n more elements: 11 6 7 19 4 1 6 18 4
			  	k:2
Output Format:	  30	maximum profit could make if single transaction allowed.

*/
import java.io.*;
import java.util.*;
public class x_BuynSellKTxn{
	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] price = new int[n];
		for(int i=0; i<n; i++) {
			price[i] =scn.nextInt();
		}

		int k =scn.nextInt();

		//dp
		int[][] dp = new int[k+1][n];

		for(int i=1; i<=k; i++){
			if(i==1){
				int min = price[0];
				for(int j=1; j<n; j++){
					if(min>price[j]){
						min=price[j];
					}
					dp[i][j] = Math.max(dp[i][j-1], price[j]-min);
				}
			}
			else{
				for(int j=1;j<n;j++){
					int max=0;
					for(int x=0;x<j;x++){
						int profit= price[j]-price[x]+dp[i-1][x];
						if(max<profit){
							max=profit;
						}
					}
					if(max<dp[i][j-1]){
						max=dp[i][j-1];
					}
					dp[i][j] = max;
				}
			}
		}
		System.out.println(dp[k][n-1]);
	}
}