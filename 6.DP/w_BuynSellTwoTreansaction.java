//////////////////////////////////////////////Buy And Sell Stocks - Two Transactions Allowed
/*
1.Given n, number of days.
2. where ith number represents price of stock on ith day.
3. print the maximum profit could make if allowed two transactions at-most.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)

Input Format: A number n  .. n more elements
Output Format: A number representing the maximum profit you can make if you are allowed a single transaction.

Sample Input: 9
			  11 6 7 19 4 1 6 18 4
Sample Output: 30

*/

import java.io.*;
import java.util.*;

public class w_BuynSellTwoTreansaction{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] price = new int[n];
		for(int i=0; i<n; i++){
			price[i] = scn.nextInt();
		}

		//left to right array
		int[] left = new int[n];
        int min = price[0];
        for(int i=1; i<n;i++){
            if(min>price[i]){
                min = price[i];
            }
            left[i] = Math.max(left[i-1], price[i]-min);
        }
        
        //right to left array
        int[] right = new int[n];
        int max = price[n-1];
        
        for(int i=n-2; i>=0;i--){
            if(max<price[i]){
                max = price[i];
            }
            right[i] = Math.max(right[i+1], max-price[i]);
        }
        
        int profit = left[0]+ right[0];
        for(int i=1; i<n;i++){
            if(profit < left[i]+right[i]){
                profit=left[i]+right[i];
            }
        }
        System.out.println(profit);

	}
}