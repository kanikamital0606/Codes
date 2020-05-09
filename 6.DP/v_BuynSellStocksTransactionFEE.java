//////////////////////////////Buy And Sell Stocks With Transaction Fee - Infinite Transactions Allowed
/*

1. Given n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are give a number fee, representing the transaction fee for every transaction.
4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)

                           
Input Format: A number n  .. n more elements
							 A number fee
Output Format: A number representing max profit you can make if you are allowed infinite transactions with transaction fee.
Sample Input: 	12
				10	15	17	20	16	18	22	20	22	20	23	25
				3
Sample Output:	13
*/
import java.io.*;
import java.util.*;
public class v_BuynSellStocksTransactionFEE{
	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		//create array
		int[] price = new int[n];
		for(int i=0; i<n; i++){
			price[i] = scn.nextInt();
		}

		//take transaction fee 
		int tfee = scn.nextInt();

		//base Case buyProfit && SELL profit
		int buyP  = 0 - price[0];
		int sellP = 0;

		for(int i=1; i<n;i++){
			int newBuy = Math.max(sellP -price[i], buyP); //find maximum between 
			int newSell = Math.max(price[i]+ buyP - tfee, sellP);


			buyP = newBuy;
			sellP = newSell;
		}

		System.out.println(sellP);
	}
}