////////////////////////////////////Buy And Sell Stocks-infinite Transactions Allowed
/*
1. n, representing the number of days.
2. given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed infinite transactions.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)
                               
Input Format:  n......n more elements
Output Format: A number representing the maximum profit you can make if you are allowed infinite transactions.

Sample Input:		9
11	6	7	19	4	1	6	18	4
Sample Output:		30
*/

import java.io.*;
import java.util.*;

public class u_BuynSellStocksMultipleTransaction{
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] price = new int[n];

		for(int i=0; i<n; i++){
			price[i] = scn.nextInt();
		}

		int profit = 0;

		for(int i=1; i<n; i++){
			if(price[i] > price[i-1]){
				profit += price[i]-price[i-1];
			}
		}
		System.out.println(profit);

	}
}
