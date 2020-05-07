import java.io.*;
import java.util.*;

public class i_CoinChangecombination{
	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] coins = new int[n];

		for(int i=0; i<n; i++){
			coins[i] = scn.nextInt();
		}

		int amt = scn.nextInt();
		System.out.println(countWays(coins, amt));
	}

	public static int countWays(int[] coins, int amt){
		int[] dp = new int[amt+1];


		//base case
		dp[0] =1;

		for(int j=0; j<coins.length; j++){
			int coin = coins[j]; //2,3,5
			for(int i=1; i<dp.length; i++){
				if(i-coin>=0){
					//source = i.....i-coin = intermediate ....0 =dest
					dp[i]+= dp[i-coin];
				}
			}
		}
		return dp[amt];

	}
}