//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Coin Change Permutations
/*
Question
1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of permutations of the n coins using which the amount "amt" can be paid.
Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be used for many installments in payment of "amt"
Note2 -> You are required to find the count of permutations and not combinations i.e.
2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same combination. You should treat them as 3 and not 1.


                               Input Format: A number n
                               n1 n2  .. n number of elements
                               A number amt
        
                               Output Format
A number representing the count of combinations of coins which can be used to pay the amount "amt"

Sample Input
4
2
3
5
6
7

Sample Output 5

*/
import java.io.*;
import java.util.*;

public class h_coinChangePermutation{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        
        for(int i=0; i<n;i++){
            coins[i] = scn.nextInt();
        }
        int amt = scn.nextInt();
        System.out.println(countWays(coins,amt));
    }

    public static int countWays(int[] coins, int amt){

        int[] dp = new int[amt+1];
        //base case
        dp[0] =1;

        for(int i=1; i<dp.length;i++){
            for(int j=0; j<coins.length; j++){
                int coin = coins[j];
                if(i-coin >= 0){
                    dp[i] += dp[i-coin];
                }
            }
        }
        return dp[amt];
    }
}